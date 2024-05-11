package com.gameOfCarts.models;


public class Fuerza_de_espejo extends Objeto{

    public Fuerza_de_espejo(String tipo, String nombre, String descripcion) {
            super(tipo, nombre, descripcion);

    }
        public Fuerza_de_espejo() {
            super("Trampa","FUERZA DE ESPEJO","Cuando un monstruo de un adversario declara un ataque: destruye todos los monstruos en Posición de Ataque.");
        }

        public void Mostrar_datos(){
            System.out.println("Tipo: "+getTipo());
            System.out.println("Nombre: "+getNombre());
            System.out.println("Detalle: "+getDescripcion());
        }

}

