package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Amo_Legendario_del_Jujitsu extends Criaturas {

    public Amo_Legendario_del_Jujitsu() {
        super(
                "TIERRA",
                "Roca / Efecto",
                "Amo Legendario del Jujitsu",
                3,
                """
                        Si esta carta en Posición de Defensa batalló con un monstruo, al final del Damage Step:
                        pon ese monstruo en la parte superior del Deck.
                        """,
                1300,
                1800
        );
    }
}//por ti oskr
