package com.gameOfCarts.models;


public class Objeto implements Cartas{
    private String tipo;
    private String subtipo;
    private String nombre;
    private String descripcion;

    public Objeto(String tipo,String subtipo,String nombre,String descripcion) {
        this.tipo = tipo;
        this.subtipo=subtipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(String subtipo) {
        this.tipo = subtipo;
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

    //Modifique el metodo toString() de la clase Objt para que al hacerle un sout se imprima defrente este mensaje
    @Override
    public String toString() {
        return """
                ************************************************************************
                Tipo        : """ + this.tipo+"""
                
                Subtipo     : """ + this.subtipo+"""
                
                Nombre      : """ + this.nombre+"""
                
                Descripción : 
                """ + this.descripcion;
    }//Utilice comillas triples para manejar un solo mensaje

}
