package com.deadwingg.ws.soapserver;

import javax.jws.WebService;

@WebService
public interface ProductoWSService {
    Double calcular(int operacion, double val1, double val2);
}
