package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Heroe_Elemental_Avian extends Criaturas {

    //Elimine el primer constructor por que no era necesario, y utilice comillas triples en la descripción
    public Heroe_Elemental_Avian() {
        super(
                "VIENTO",
                "Guerrero / Normal",
                "HÉROE Elemental Avian",
                3,
                """
                        Un HÉROE Elemental alado que gira cruzando el cielo y manipula el viento.
                        Su movimiento personal, Rompeplumas, le propina a la vileza un golpe desde
                        el cielo.
                        """,
                1000,
                1000);
    }

}
