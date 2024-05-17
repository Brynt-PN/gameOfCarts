package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Archidemonio_Peón_Vil extends Criaturas {

    public Archidemonio_Peón_Vil() {
        super(
                "TIERRA",
                "Demonio / Efecto",
                "Archidemonio Peón Vil",
                2,
                """
                        Una vez por turno, durante tu Standby Phase, debes pagar 500 LP (esto no es opcional),
                        o esta carta es destruida. Al resolver el efecto de una carta del adversario que
                        seleccione esta carta, lanza un dado de seis caras y niega ese efecto si sale 3 y,
                        si lo haces, destruye esa carta. Los monstruos de tu adversario no pueden atacar
                        ningún monstruo "Archidemonio" que controles, excepto "Archidemonio Peón Vil".
                        """,
                1200,
                200
        );
    }
}
//por ti oskr