package com.deadwingg.ws.client;

import com.deadwingg.ws.soapserver.Producto;
import com.deadwingg.ws.soapserver.impl.ProductoWSService;
import com.deadwingg.ws.soapserver.impl.ProductoWSServiceImplService;

public class ProductoWSClient {
    public static void main(String[] args) {
        ProductoWSServiceImplService wsClient = new ProductoWSServiceImplService();
        ProductoWSService client = wsClient.getProductoWSServiceImplPort();
        double numero = client.calcular(1, 100, 200);
        System.out.println(numero);
        Producto resultado = client.getProducto("A001");
        System.out.println(resultado.toString());
    }
}
