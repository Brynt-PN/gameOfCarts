package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Archidemonio_Alfil_Oscuro extends Criaturas {

    public Archidemonio_Alfil_Oscuro() {
        super(
                "AGUA",
                "Demonio / Efecto",
                "Archidemonio Alfil Oscuro",
                3,
                """
                        Una vez por turno, durante tu Standby Phase, debes pagar 500 LP (esto no es opcional),
                        o esta carta es destruida. Al resolver el efecto de una carta del adversario que seleccione
                        un monstruo "Archidemonio" que controlas, lanza un dado de seis caras y niega ese efecto si
                        sale 1, 3 o 6 y, si lo haces, destruye esa carta.
                        """,
                300,
                1400
        );
    }
}
