package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class HÉROE_Malvado_Wild_Cyclone extends Criaturas {
    public HÉROE_Malvado_Wild_Cyclone() {
        super(
                "TIERRA",
                "Demonio / Fusión / Efecto",
                "HÉROE Malvado Wild Cyclone",
                8,
                """
                        "HÉROE Elemental Avian" + "HÉROE Elemental Wildheart"
                        Debe ser Invocado de Modo Especial con "Fusión Oscura".
                        Si esta carta ataca, tu adversario no puede activar
                        Cartas Mágicas/de Trampa hasta el final del Damage Step.
                        Si esta carta inflige daño de batalla a tu adversario:
                        destruye todas las Mágicas/Trampas Colocadas que controle tu adversario.
                        """,
                1900,
                2300
        );
    }
}
//por ti oskr