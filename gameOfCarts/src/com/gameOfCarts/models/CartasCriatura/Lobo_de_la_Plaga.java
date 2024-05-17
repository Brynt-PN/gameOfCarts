package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Lobo_de_la_Plaga extends Criaturas {
    public Lobo_de_la_Plaga() {
        super(
                "OSCURIDAD",
                "Zombi / Efecto",
                "Lobo de la Plaga",
                3,
                """
                        Una vez por turno: puedes hacer que el ATK de esta carta se convierta
                        en el doble de su ATK original hasta el final de este turno.
                        Una vez por turno, durante la End Phase, si este efecto fue activado:
                        destruye esta carta.
                        """,
                1000,
                1000
        );
    }
}
//por ti oskr