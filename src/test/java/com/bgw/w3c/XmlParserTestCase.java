package com.bgw.w3c;

import com.sun.org.apache.xerces.internal.dom.DeferredAttrImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredElementImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredNode;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * XmlParserTestCase
 *
 * @author zhibin.wang
 * @since 2019-11-26 18:14
 **/
public class XmlParserTestCase {

    private final String XML_PATH = "E:\\Codes\\IdeaProjects\\springframework-samples\\src\\main\\resources\\config\\w3c-dom-school.xml";
    private Document document;

    @Before
    public void init() throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        document = documentBuilder.parse(XML_PATH);
        //System.out.println("DocumentImplClass:" + document.getImplementation());
        //System.out.println("DocumentImplClass:" + document.getClass());
    }

    @Test
    public void parseRoot() throws Exception {
        NodeList nls = document.getChildNodes();
        System.out.println("Document ChildNodes: " + nls.getLength());

        for (int m = 0; m < nls.getLength(); m++) {
            Node node = document.getChildNodes().item(m);
            System.out.println("Node class: " + node.getClass());
            System.out.println("m : " + m + ", fNodeIndex: " + ((DeferredNode) node).getNodeIndex());
            System.out.println("m : " + m + ", nodeName: " + node.getNodeName());

            System.out.println("attributes class: " + node.getAttributes().getClass());
            NamedNodeMap attributes = node.getAttributes();
            System.out.println("attributes len: " + attributes.getLength());
            for (int k = 0; k < attributes.getLength(); k++) {
                Node attrNode = attributes.getNamedItem("name");
                System.out.println("attrNode class: " + attrNode.getClass());
                DeferredAttrImpl attr = (DeferredAttrImpl)attrNode;
                System.out.println("AttrNodeName: " + attr.getNodeName());
                System.out.println("AttrNodeValue: " + attr.getNodeValue());
            }

        }
    }

    @Test
    public void parseSchool() {
        NodeList nls = document.getElementsByTagName("School");
        System.out.println(nls.getLength() + " School Nodes");
        for (int i = 0; i < nls.getLength(); i++) {
            Node schoolNode = nls.item(i); // DeferredElementImpl
            Element ele = (Element) schoolNode;
            System.out.println("SchoolNode fNodeIndex: " + ((DeferredNode) ele).getNodeIndex());
            System.out.println("SchoolNode tagName: " + ele.getTagName());

            NodeList childNodes = schoolNode.getChildNodes();
            System.out.println("NodeList class: " + childNodes.getClass());
            System.out.println("SchoolNode childNodes: " + childNodes.getLength());

        }
    }

    @Test
    public void parseStudent() {
        NodeList nls = document.getElementsByTagName("Student");
        System.out.println("StudentNode: " + nls.getLength());

        for (int i = 0; i < nls.getLength(); i++) {
            Node studentNode = nls.item(i);
            System.out.println("studentNode fNodeIndex: " + ((DeferredNode) studentNode).getNodeIndex());
            System.out.println("studentNode Name: " + studentNode.getNodeName());
            System.out.println("studentNode Value: " + studentNode.getNodeValue());

            NamedNodeMap attributes = studentNode.getAttributes();
            System.out.println("attributes len: " + attributes.getLength());
            for (int k = 0; k < attributes.getLength(); k++) {
                Node attr = attributes.item(k);
                System.out.println("attrNode class: " + attr.getClass());

                System.out.println("AttrNodeName: " + attr.getNodeName());
                System.out.println("AttrNodeValue: " + attr.getNodeValue());
                System.out.println("------------------------------------------");
            }

            System.out.println("##########################################");
        }
    }

    @Test
    public void parseStudentChildNodes() {
        NodeList nls = document.getElementsByTagName("Student");
        System.out.println("StudentNode: " + nls.getLength());
        Node studentNode = nls.item(0);
        NodeList childNodes = studentNode.getChildNodes();
        System.out.println("StudentChildNodes: " + childNodes.getLength());
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node node = childNodes.item(i);

            System.out.println("node class : " + node.getClass());
            System.out.println("node name : " + node.getNodeName());
            System.out.println("node value : " + node.getNodeValue());
            System.out.println("node type : " + node.getNodeType());

            if (node.getNodeType() == 1) {
                System.out.println("Node name:" + node.getNodeName());
                System.out.println("Node val:" + node.getFirstChild().getTextContent());
            }

        }
    }
}
