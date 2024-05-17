package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Archidemonio_Cráneo_del_Relámpago extends Criaturas {

    public Archidemonio_Cráneo_del_Relámpago() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "Archidemonio Cráneo del Relámpago",
                6,
                """
                        Una vez por turno, durante tu Standby Phase, debes pagar 500 LP (esto no es opcional),
                        o esta carta es destruida. Al resolver el efecto de una carta del adversario que
                        seleccione esta carta, lanza un dado de seis caras y niega ese efecto si sale
                        1, 3 o 6 y, si lo haces, destruye esa carta.
                        """,
                2500,
                1200
        );
    }
}

//por ti oskr