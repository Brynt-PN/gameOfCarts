
package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Archidemonio_Caballero_de_la_Sombra  extends Criaturas {

    public Archidemonio_Caballero_de_la_Sombra() {
        super(
                "VIENTO",
                "Demonio / Efecto",
                "Archidemonio Caballero de la Sombra",
                4,
                """
                        Una vez por turno, durante tu Standby Phase, debes pagar 900 LP (esto no es opcional),
                        o esta carta es destruida. Al resolver el efecto de una carta del adversario que
                        seleccione esta carta, lanza un dado de seis caras y niega ese efecto si sale 3 y, si lo
                        haces, destruye esa carta. Cualquier daño de batalla que esta carta inflige a tu
                        adversario se divide a la mitad.
                        """,
                2000,
                1600
        );
    }
}//por ti oskr

