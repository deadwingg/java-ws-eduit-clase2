package com.deadwingg.ws.soapserver.impl;

import com.deadwingg.ws.soapserver.ProductoWSService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.deadwingg.ws.soapserver.ProductoWSService")
public class ProductoWSServiceImpl implements ProductoWSService {
    @Override
    public Double calcular(int operacion, double val1, double val2) {
        double resultado = 0;
        switch (operacion){
            case 1:
                resultado = val1 + val2;
                break;
            case 2:
                resultado = val1 - val2;
                break;
            case 3:
                resultado = val1 * val2;
                break;
            case 4:
                resultado = val1 / val2;
                break;
        }
        return resultado;
    }


}
