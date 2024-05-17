package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Koala_Vampírico extends Criaturas {
    public Koala_Vampírico() {
        super(
                "TIERRA",
                "Bestia / Efecto",
                "Koala Vampírico",
                4,
                """
                       Si esta carta inflige daño de batalla a tu adversario batallando
                       con un monstruo: gana LP iguales al daño de batalla infligido.
                        """,
                1800,
                1500
        );
    }
}
//por ti oskr