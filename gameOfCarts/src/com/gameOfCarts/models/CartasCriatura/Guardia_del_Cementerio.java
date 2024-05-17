package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Guardia_del_Cementerio extends Criaturas {
    public Guardia_del_Cementerio() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "Guardia del Cementerio",
                4,
                """
                        Cualquier monstruo destruido en batalla
                        se baraja al Deck en vez de ir al Cementerio.
                        """,
                0,
                2000
        );
    }
}
//por ti oskr