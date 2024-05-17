package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Motociclista_de_la_Hoja_Circular extends Criaturas {
    public Motociclista_de_la_Hoja_Circular() {
        super(
                "VIENTO",
                "Demonio / Efecto",
                "Motociclista de la Hoja Circular",
                4,
                """
                        Una vez por turno: puedes seleccionar 1 Trampa Normal en tu Cementerio;
                        destierra ese objetivo y, si lo haces,
                        esta carta gana 500 ATK hasta el final del turno de tu adversario.
                        """,
                1700,
                1500
        );
    }
}
//por ti oskr