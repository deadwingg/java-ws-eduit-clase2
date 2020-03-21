package com.deadwingg.ws.client;

import com.deadwingg.ws.soapserver.impl.ProductoWSService;
import com.deadwingg.ws.soapserver.impl.ProductoWSServiceImplService;

public class ProductoWSClient {
    public static void main(String[] args) {
        ProductoWSServiceImplService wsClient = new ProductoWSServiceImplService();
        ProductoWSService client = wsClient.getProductoWSServiceImplPort();
        double resultado = client.calcular(1,200,100);
        System.out.println(resultado);
    }
}
