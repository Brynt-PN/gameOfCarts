package com.gameOfCarts.models.CartasObjeto;


import com.gameOfCarts.models.Objeto;

public class Rascacielos_2 extends Objeto {

    public Rascacielos_2(String tipo, String subtipo, String nombre, String descripcion) {
            super(tipo,subtipo,nombre, descripcion);

    }
    public Rascacielos_2() {
            super("MÁGICA","Campo","Rascacielos 2 - Ciudad de Héroes","Una vez por turno, durante tu Main Phase, si controlas esta carta:\n puedes seleccionar 1 monstruo HÉROE Elemental en tu Cementerio que fuera destruido en batalla\n y mandado ahí; Invoca ese objetivo de Modo Especial.");
    }
}


