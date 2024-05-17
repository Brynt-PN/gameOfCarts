package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Mordelón extends Criaturas {
    public Mordelón() {
        super(
                "AGUA",
                "Reptil / Efecto",
                "Mordelón",
                5,
                """
                        Si esta carta ataca a un monstruo en Posición de Defensa,
                        inflige daño de batalla de penetración a tu adversario.
                        """,
                2400,
                1000
        );
    }
}
//por ti oskr