package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Jinete_del_Caos_Gustaph extends Criaturas {
    public Jinete_del_Caos_Gustaph() {
        super(
                "VIENTO",
                "Guerrero / Efecto",
                "Jinete del Caos Gustaph",
                4,
                """
                        Una vez por turno: puedes desterrar hasta 2 Mágicas en tu Cementerio;
                        esta carta gana 300 ATK por cada carta desterrada por este efecto,
                        hasta el final del turno de tu adversario.
                        """,
                1400,
                1500
        );
    }
}
//por ti oskr