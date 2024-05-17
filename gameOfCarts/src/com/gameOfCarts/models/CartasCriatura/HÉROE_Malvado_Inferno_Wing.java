package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class HÉROE_Malvado_Inferno_Wing extends Criaturas {
    public HÉROE_Malvado_Inferno_Wing() {
        super(
                "FUEGO",
                "Demonio / Fusión / Efecto",
                "HÉROE_Malvado_Inferno_Wing",
                6,
                """
                        "HÉROE Elemental Avian" + "HÉROE Elemental Burstinatrix"
                        Debe ser Invocado de Modo Especial con "Fusión Oscura".
                        Si esta carta ataca un monstruo en Posición de Defensa,
                        inflige daño de batalla de penetración. Si esta carta destruye un monstruo
                        en batalla y lo manda al Cementerio: inflige daño a tu adversario
                        igual al ATK o DEF originales (lo que sea mayor)
                        de ese monstruo en el Cementerio.
                        """,
                2100,
                1200
        );
    }
}
//por ti oskr