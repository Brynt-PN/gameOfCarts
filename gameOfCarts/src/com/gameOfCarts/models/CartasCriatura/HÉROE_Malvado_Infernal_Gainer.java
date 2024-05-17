package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class HÉROE_Malvado_Infernal_Gainer extends Criaturas {
    public HÉROE_Malvado_Infernal_Gainer() {
        super(
                "TIERRA",
                "Demonio / Efecto",
                "OHÉROE Malvado Infernal Gainer",
                4,
                """
                        Durante tu Main Phase 1: puedes desterrar esta carta en el Campo,
                        y después selecciona 1 monstruo Demonio que controles;
                        mientras lo controles boca arriba, ese objetivo
                        puede hacer un segundo ataque durante cada Battle Phase.
                        Una vez por turno, durante tu segunda Standby Phase
                        después de que esta carta fuera desterrada para activar este efecto:
                        Invoca esta carta de Modo Especial en Posición de Ataque.
                        """,
                1600,
                0
        );
    }
}
//por ti oskr