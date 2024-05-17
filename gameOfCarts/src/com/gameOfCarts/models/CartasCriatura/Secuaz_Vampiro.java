package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Secuaz_Vampiro extends Criaturas {
    public Secuaz_Vampiro() {
        super(
                "OSCURIDAD",
                "Zombi / Efecto",
                "Secuaz Vampiro",
                2,
                """
                        Si esta carta es Invocada de Modo Especial:
                        puedes pagar 500 LP; añade a tu mano 1 Mágica/Trampa
                        "Vampiro/a" en tu Deck. Si esta carta está en tu Cementerio:
                        puedes mandar al Cementerio 1 carta "Vampiro/a" en tu mano o Campo boca arriba;
                        Invoca esta carta de Modo Especial, pero destiérrala cuando deje el Campo.
                        Sólo puedes usar cada efecto de "Secuaz Vampiro" una vez por turno.
                        """,
                2000,
                0
        );
    }
}
//por ti oskr