package com.bgw.w3c;

import com.sun.corba.se.spi.orb.PropertyParser;
import com.sun.org.apache.xerces.internal.dom.DeferredAttrImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredNode;
import com.sun.org.apache.xpath.internal.compiler.XPathParser;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

/**
 * MybatisXmlParseTest
 *
 * @author zhibin.wang
 * @since 2021/01/29 17:08
 */
public class MybatisXmlParseTest {

    private Document document;

    @Before
    public void init() throws Exception {
        document = MyDocumentFactory.getDocument("w3c-dom-select.xml");
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

        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println("======================{" + (i + 1) + "}======================");
            Node item = nodeList.item(i);
            System.out.println("item.getNodeName() = " + item.getNodeName());
            System.out.println("item.getNodeValue() = " + item.getNodeValue());
            System.out.println("item.getNodeType() = " + item.getNodeType());
            System.out.println("item = " + item.getTextContent());

        }

//        Node secondNode = nodeList.item(1);
//        NodeList secList = secondNode.getChildNodes();
//        for (int i = 0; i < secList.getLength(); i++) {
//            Node item = secList.item(i);
//            System.out.println("item.getNodeName() = " + item.getNodeName());
//            System.out.println("item.getNodeValue() = " + item.getNodeValue());
//            System.out.println("item.getNodeType() = " + item.getNodeType());
//        }

    }

    @Test
    public void testQueryById() {
        String id = "listAll";

        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            if (item.getNodeType() == 1) {
               // Attr itemAttr = item.get


            }
        }


    }

    @Test
    public void testXPath() throws Exception {
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        Object data = xpath.evaluate("/mapper/select", document);
        System.out.println("data = " + data);

    }
}
