package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Cazador_de_Vampiros extends Criaturas {


    public Cazador_de_Vampiros() {
        super(
                "OSCURIDAD",
                "Guerrero / Efecto",
                "Cazador de Vampiros",
                4,
                """
                        Al comienzo del Damage Step, si esta carta batalla con un monstruo de OSCURIDAD:
                        destruye ese monstruo.
                        """,
                1600,
                1600
        );
    }
}
//por ti oskr