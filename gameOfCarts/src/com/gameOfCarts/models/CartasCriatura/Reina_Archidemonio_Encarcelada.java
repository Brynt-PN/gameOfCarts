package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Reina_Archidemonio_Encarcelada extends Criaturas {
    public Reina_Archidemonio_Encarcelada() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "Reina Archidemonio Encarcelada",
                8,
                """
                        Una vez por turno, durante tu Standby Phase, debes pagar 1000 LP
                        (esto no es opcional), o esta carta es destruida. Una vez por turno,
                        durante tu Standby Phase: selecciona 1 monstruo Demonio de Nivel 4 o menor
                        en el Campo; ese objetivo gana 1000 ATK hasta el final de este turno.
                        "Pandemonium" debe estar en el Campo y esta carta debe estar
                        en tu Cementerio para activar y resolver este efecto.
                        """,
                2600,
                1700
        );
    }
}
//por ti oskr