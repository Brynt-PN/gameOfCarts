package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Polilla_de_Arena extends Criaturas {
    public Polilla_de_Arena() {
        super(
                "TIERRA",
                "Roca / Efecto",
                "Polilla de Arena",
                4,
                """
                        Si esta carta en Posición de Defensa boca abajo es destruida
                        y mandada al Cementerio: Invócala de Modo Especial
                        e intercambia su ATK/DEF originales.
                        """,
                1000,
                2000
        );
    }
}
//por ti oskr