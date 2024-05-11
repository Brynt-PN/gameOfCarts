package com.gameOfCarts.models;

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

    @Override
    public void Accion() {
        Scanner s = new Scanner(System.in);
        int option;
        do {
            System.out.println("Elige una de las operaciones:" + "\n"
                    + "1) Ver detalles de la carta" + "\n"
                    + "2) Activar la carta" + "\n"
                    + "3) Poner la carta boca a bajo" + "\n"
                    + "4) salir" + "\n");
            option = s.nextInt();
            
        } while (option != 4);
    }
}
