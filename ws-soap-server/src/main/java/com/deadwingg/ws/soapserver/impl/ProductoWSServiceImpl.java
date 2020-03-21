package com.deadwingg.ws.soapserver.impl;

import com.deadwingg.ws.domain.Producto;
import com.deadwingg.ws.soapserver.ProductoWSService;
import org.hibernate.Transaction;

import javax.jws.WebService;
import javax.persistence.*;

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

    @Override
    public Producto getProducto(String codigoProducto) throws RuntimeException{
        if (codigoProducto == null || codigoProducto.equalsIgnoreCase("")) {
            throw new RuntimeException("Codigo debe ser informado");
        }
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("productosDB");
        EntityManager em = factory.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        Producto p = null;
        try{
            tr.begin();
            String sql = "SELECT p from Producto p where p.codigo = :codigo";
            TypedQuery<Producto> pq = em.createQuery(sql, Producto.class);
            pq.setParameter("codigo", codigoProducto);
            p = pq.getSingleResult();
            tr.commit();
        } catch (Exception ex){
            ex.printStackTrace();
            tr.rollback();
        }
        return p;
    }


}
