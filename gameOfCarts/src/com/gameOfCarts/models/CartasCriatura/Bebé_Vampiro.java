package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Bebé_Vampiro extends Criaturas {

    public Bebé_Vampiro() {
        super(
                "OSCURIDAD",
                "Zombi / Efecto",
                "Bebé Vampiro",
                3,
                """
                        Al final de la Battle Phase, si esta carta destruyó un monstruo en batalla
                        y lo mandó al Cementerio este turno: puedes Invocar ese monstruo de Modo
                        Especial a tu Campo.
                        """,
                700,
                1000
        );
    }
}
//por ti oskr