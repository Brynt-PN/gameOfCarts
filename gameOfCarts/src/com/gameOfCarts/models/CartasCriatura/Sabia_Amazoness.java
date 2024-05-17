package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Sabia_Amazoness extends Criaturas {
    public Sabia_Amazoness() {
        super(
                "TIERRA",
                "Gerrero / Efecto",
                "Sabia Amazoness",
                4,
                """
                        Al final del Damage Step, si esta carta atacó y
                        todavía está en el Campo: selecciona 1 Mágica/Trampa
                        que controle tu adversario; destruye ese objetivo.
                        """,
                1400,
                700
        );
    }
}
//por ti oskr