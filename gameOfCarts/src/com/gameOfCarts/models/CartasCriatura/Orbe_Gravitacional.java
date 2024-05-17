package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Orbe_Gravitacional extends Criaturas {
    public Orbe_Gravitacional() {
        super(
                "OSCURIDAD",
                "Demonio / Volteo / Efecto",
                "Orbe Gravitacional",
                3,
                """
                        VOLTEO: Cambia las posiciones de batalla de todos
                        los monstruos boca arriba que controle tu adversario.
                        """,
                1100,
                700
        );
    }
}
//por ti oskr