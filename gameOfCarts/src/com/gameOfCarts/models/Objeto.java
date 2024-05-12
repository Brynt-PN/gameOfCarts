package com.gameOfCarts.models;

import java.util.Scanner;

public class Objeto {
    private String tipo;
    private String nombre;
    private String descripcion;

    public Objeto(String tipo,String nombre,String descripcion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void Mostrar_datos(){
        System.out.println("Tipo: "+getTipo());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Detalle: "+getDescripcion());
    }

}
