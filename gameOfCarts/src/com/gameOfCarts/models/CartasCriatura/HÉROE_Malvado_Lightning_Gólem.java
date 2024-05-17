package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class HÉROE_Malvado_Lightning_Gólem extends Criaturas {
    public HÉROE_Malvado_Lightning_Gólem() {
        super(
                "LUZ",
                "Demonio / Fusión / Efecto",
                "HÉROE Malvado Lightning Gólem",
                6,
                """
                        "HÉROE Elemental Sparkman" + "HÉROE Elemental Clayman"
                        Debe ser Invocado de Modo Especial con "Fusión Oscura".
                        Una vez por turno: puedes seleccionar 1 monstruo en el Campo;
                        destruye ese objetivo.
                        """,
                2400,
                1500
        );
    }
}
//por ti oskr