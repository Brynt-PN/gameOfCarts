package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Tigre_Amazoness extends Criaturas {
    public Tigre_Amazoness() {
        super(
                "TIERRA",
                "Bestia / Efecto",
                "Tigre Amazoness",
                4,
                """
                        Sólo puedes controlar 1 "Tigre Amazoness". Gana 400 ATK por cada monstruo "Amazoness"
                        que controles. Los monstruos de tu adversario
                        no pueden atacar ningún monstruo "Amazoness", excepto éste.
                        """,
                1100,
                1500
        );
    }
}
//por ti oskr