package com.deadwingg.ws;

import com.deadwingg.ws.soapserver.ProductoWSService;
import com.deadwingg.ws.soapserver.impl.ProductoWSServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {

        ProductoWSService service = new ProductoWSServiceImpl();
        Double resultado = service.calcular(1, 100, 200);
        assertEquals(300d, resultado.doubleValue(), 0.5);
    }
}
