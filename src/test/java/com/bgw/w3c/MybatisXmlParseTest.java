package com.bgw.w3c;

import com.sun.org.apache.xerces.internal.dom.DeferredAttrImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredNode;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
    public void parseRoot() throws Exception {
        NodeList nls = document.getChildNodes();
        System.out.println("nls.item(0) = " + nls.item(0));
        NodeList nls2 = document.getElementsByTagName("mapper");
        System.out.println("nls2 = " + nls2);


        System.out.println("nls2 = " + nls2.item(0).getNodeName());
    }
}
