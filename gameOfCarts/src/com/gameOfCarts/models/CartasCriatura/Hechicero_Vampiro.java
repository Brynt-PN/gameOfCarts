package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Hechicero_Vampiro extends Criaturas {
    public Hechicero_Vampiro() {
        super(
                "OSCURIDAD",
                "Zombi / Efecto",
                "Hechicero Vampiro",
                4,
                """
                        Si esta carta en tu posesión es mandada a tu Cementerio
                        por la carta de tu adversario: puedes añadir a tu mano 1 monstruo
                        "Vampiro/a" de OSCURIDAD o 1 Mágica/Trampa "Vampiro/a" en tu Deck.
                        Puedes desterrar esta carta en tu Cementerio; este turno, 1 monstruo
                        "Vampiro/a" de OSCURIDAD que Invoques de Modo Normal puede ser Invocado
                        sin Sacrificar.
                        """,
                1500,
                1500
        );
    }
}
//por ti oskr