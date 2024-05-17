package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Madre_Oso_Pardo extends Criaturas {
    public Madre_Oso_Pardo() {
        super(
                "AGUA",
                "Guerrero-Bestia / Efecto",
                "Madre Oso Pardo",
                4,
                """
                        Cuando esta carta es destruida en batalla y mandada al Cementerio:
                        puedes Invocar de Modo Especial, desde tu Deck,
                        1 monstruo de AGUA con 1500 ATK o menos en Posición de Ataque.
                        """,
                1400,
                1000
        );
    }
}
//por ti oskr