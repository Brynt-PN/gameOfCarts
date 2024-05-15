package com.gameOfCarts.models;

public class Criaturas implements Cartas{
    private String tipo;
    private String subtipo;
    private String nombre;
    private int nivel;
    private String descripcion;
    private int atk;
    private int def;

    public Criaturas (String tipo,String subtipo,String nombre,int nivel,String descripcion,int atk,int def) {
        this.tipo = tipo;
        this.subtipo = subtipo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.atk = atk;
        this.def = def;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    //metodo que muestra la info de las clases hijas de Criaturas.

    @Override
    public String toString() {
        return """
                ************************************************************************
                 Tipo        : """ + this.tipo+""" 
                 Subtipo     : """ + this.subtipo+""" 
                 Nombre      : """ + this.nombre+""" 
                 Nivel       : """+ this.nivel+""" 
                 ATK: """+this.atk+ "DEF: "+this.def+""" 
                 Descripción : """ + this.descripcion;
    }
}
