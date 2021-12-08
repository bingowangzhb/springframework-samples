package com.bgw.w3c;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * MybatisXmlParseTest
 *
 * @author zhibin.bgw
 * @since 2021/01/29 17:08
 */
public class MybatisXmlParseTest {

    private Document document;
    private XPath xpath;

    @Before
    public void init() throws Exception {
        document = MyDocumentFactory.getDocument("w3c-dom-select.xml");
        xpath = XPathFactory.newInstance().newXPath();
    }

    @Test
    public void parseElement() throws Exception {
        Element root = document.getDocumentElement();
        String rootTagName = root.getTagName();
        Attr namespaceAttr = root.getAttributeNode("namespace");
        System.out.println("rootTagName = " + rootTagName);
        System.out.println("namespaceAttr.getName() = " + namespaceAttr.getName());
        System.out.println("namespaceAttr.getValue() = " + namespaceAttr.getValue());

        System.out.println("root.getNodeName() = " + root.getNodeName());
        System.out.println("root.getNodeValue() = " + root.getNodeValue());
        System.out.println("root.getNodeType() = " + root.getNodeType());
    }

    @Test
    public void parseNode() throws Exception {
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();
        System.out.println("nodeList.getLength() = " + nodeList.getLength());

//        for (int i = 0; i < nodeList.getLength(); i++) {
//            System.out.println("======================{" + (i + 1) + "}======================");
//            Node item = nodeList.item(i);
//            System.out.println("item.getNodeName() = " + item.getNodeName());
//            System.out.println("item.getNodeValue() = " + item.getNodeValue());
//            System.out.println("item.getNodeType() = " + item.getNodeType());
//            System.out.println("item = " + item.getTextContent());
//
//        }

        Node secondNode = nodeList.item(3);
        NodeList secList = secondNode.getChildNodes();
        for (int i = 0; i < secList.getLength(); i++) {
            Node item = secList.item(i);
            System.out.println("================== " + (i + 1) + " ====================");
            System.out.println("item.getNodeName() = " + item.getNodeName());
            System.out.println("item.getNodeValue() = " + item.getNodeValue());
            System.out.println("item.getNodeType() = " + item.getNodeType());
        }

    }

    @Test
    public void testQueryById() {
        String id = "listAll";

        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            if (item.getNodeType() == 1) {

            }
        }


    }

    @Test
    public void testXPath() throws Exception {
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();
        System.out.println("nodeList.getLength() = " + nodeList.getLength());

        List<XNode> selectNodes = evalNodes("select|insert|update|delete", document);
        System.out.println("selectNodes = " + selectNodes.size());
        List<XNode> sqlNodes = evalNodes("/mapper/sql", document);
        System.out.println("sqlNodes.size() = " + sqlNodes.size());
    }

    private Object evaluate(String expression, Object root, QName returnType) {
        try {
            return xpath.evaluate(expression, root, returnType);
        }
        catch (XPathExpressionException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<XNode> evalNodes(String expression, Object root) {
        List<XNode> xNodes = new ArrayList<>();
        NodeList nodeList = (NodeList) evaluate(expression, root, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            xNodes.add(new XNode(nodeList.item(i)));
        }

        return xNodes;
    }

    private static class XNode {
        private final Node node;
        private final String name;
        private String body;

        public XNode(Node node) {
            this.node = node;
            this.name = node.getNodeName();
        }

        public Node getNode() {
            return node;
        }

        public String getName() {
            return name;
        }

        public String getBody() {
            return body;
        }
    }

}
