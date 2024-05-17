package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Recargador_Loco extends Criaturas {
    public Recargador_Loco() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "Recargador Loco",
                1,
                """
                        Si esta carta es destruida en batalla y mandada al Cementerio:
                        manda al Cementerio 2 cartas en tu mano y, si lo haces, roba 2 cartas.
                        """,
                0,
                0
        );
    }
}
//por ti oskr