package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class HÉROE_Elemental_Shining_Flare_Wingman extends Criaturas {
    public HÉROE_Elemental_Shining_Flare_Wingman() {
        super(
                "LUZ",
                "Guerrero / Fusión / Efecto",
                "HÉROE Elemental Shining Flare Wingman",
                8,
                """
                        "HÉROE Elemental de la Llama Wingman" + "HÉROE Elemental Sparkman"
                        Debe ser Invocado por Fusión. Gana 300 ATK por cada carta
                        "HÉROE Elemental" en tu Cementerio. Si esta carta destruye un monstruo
                        en batalla y lo manda al Cementerio:
                        inflige daño a tu adversario igual al ATK original
                        de ese monstruo en el Cementerio.
                        """,
                2500,
                2100
        );
    }
}
//por ti oskr