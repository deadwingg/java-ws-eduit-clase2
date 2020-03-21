package com.deadwingg.ws.domain;

import javax.persistence.*;

@Entity
@Table(name = "Productos_cursows")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private Float precio;
    @Column(name = "codigo", nullable = false)
    private String codigo;

    public Producto() {
    }

    public Producto(Long id, String descripcion, Float precio, String codigo) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
    }

    public Producto(String descripcion, Float precio, String codigo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
