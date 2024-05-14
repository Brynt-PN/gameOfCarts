package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class HÉROE_Elemental_Avian extends Criaturas {
    public HÉROE_Elemental_Avian(String tipo, String subtipo,String nombre, int nivel,String descripcion,int atk,int def) {
        super(tipo,subtipo,nombre,nivel, descripcion, atk, def);

    }

    public HÉROE_Elemental_Avian() {
        super("VIENTO","Guerrero / Normal","HÉROE Elemental Avian",3,"Un HÉROE Elemental alado que gira cruzando el cielo y manipula el viento.\n Su movimiento personal, Rompeplumas, le propina a la vileza un golpe desde el cielo.",1000,1000);
    }

}
