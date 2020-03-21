package com.deadwingg.ws.soapserver;

import com.deadwingg.ws.domain.Producto;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ProductoWSService {
    @WebMethod
    Double calcular(int operacion, double val1, double val2);
    @WebMethod
    Producto getProducto (String codigoProducto);
}
