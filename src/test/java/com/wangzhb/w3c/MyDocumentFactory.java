package com.wangzhb.w3c;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * MyDocumentFactory
 *
 * @author zhibin.wangzhb
 * @since 2021/01/29 17:14
 */
public abstract class MyDocumentFactory {

    private static final String BASE_PATH = "D:\\Codes\\IdeaProjects\\springframework-samples\\src\\main\\resources\\config";

    public static Document getDocument(String fileName) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();

            return documentBuilder.parse(BASE_PATH + "\\" + fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
