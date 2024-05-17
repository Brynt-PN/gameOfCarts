package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Superviviente_de_Batalla extends Criaturas {
    public Superviviente_de_Batalla() {
        super(
                "TIERRA",
                "Gerrero / Efecto",
                "Superviviente de Batalla",
                4,
                """
                        Al final de la Battle Phase: puedes añadir a tu mano 1 carta
                        en tu Cementerio que fuera mandada ahí durante esta Battle Phase
                        mientras controlabas esta carta boca arriba, excepto
                        "Superviviente de Batalla". Sólo puedes usar este efecto de
                        "Superviviente de Batalla" una vez por turno.
                        """,
                1600,
                800
        );
    }
}
//por ti oskr