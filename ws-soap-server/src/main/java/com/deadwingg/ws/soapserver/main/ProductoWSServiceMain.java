package com.deadwingg.ws.soapserver.main;

import com.deadwingg.ws.soapserver.impl.ProductoWSServiceImpl;

import javax.xml.ws.Endpoint;

public class ProductoWSServiceMain {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/", new ProductoWSServiceImpl());
        System.out.println("Publicado");
    }
}
