package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Ryu_Kokki extends Criaturas {
    public Ryu_Kokki() {
        super(
                "OSCURIDAD",
                "Zombi / Efecto",
                "Ryu Kokki",
                6,
                """
                        Al final del Damage Step, si esta carta batalló con un monstruo Guerrero
                        o Lanzador de Conjuros: destruye ese monstruo.
                        """,
                2400,
                2000
        );
    }
}
//por ti oskr