package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Tropa_Dragón extends Criaturas {
    public Tropa_Dragón() {
        super(
                "VIENTO",
                "Dragón / Efecto",
                "Tropa Dragón",
                2,
                """
                        Si esta carta es destruida en batalla y mandada al Cementerio:
                        Invoca de Modo Especial, desde tu Deck, 1 "Tropa Dragón".
                        """,
                700,
                800
        );
    }
}
//por ti oskr