package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Archidemonio_Reina_Infernal extends Criaturas {

    public Archidemonio_Reina_Infernal() {
        super(
                "FUEGO",
                "Demonio / Efecto",
                "Archidemonio Reina Infernal",
                4,
                """
                        Una vez por turno, durante tu Standby Phase, debes pagar 500 LP (esto no es opcional),
                        o esta carta es destruida. Al resolver el efecto de una carta del adversario que
                        seleccione esta carta, lanza un dado de seis caras y niega ese efecto si sale 2 o 5 y,
                        si lo haces, destruye esa carta. Una vez por turno, durante la Standby Phase: selecciona
                        1 monstruo "Archidemonio" en el Campo; éste gana 1000 ATK hasta el final de este turno.
                        """,
                900,
                1500
        );
    }
}
//por ti oskr