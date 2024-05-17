package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Aprendiza_Amazoness extends Criaturas {

    public Aprendiza_Amazoness() {
        super(
                "TIERRA",
                "Guerrero / Efecto",
                "Aprendiza Amazoness",
                4,
                """
                        Los monstruos destruidos en batalla con esta carta se ponen en la parte inferior del Deck
                        en vez de ir al Cementerio. Si esta carta destruye un monstruo del adversario en batalla:
                        ésta gana 200 ATK.
                        """,
                1500,
                1300
        );
    }
}
