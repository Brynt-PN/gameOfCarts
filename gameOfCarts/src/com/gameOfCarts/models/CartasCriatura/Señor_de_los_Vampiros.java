package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Señor_de_los_Vampiros extends Criaturas {
    public Señor_de_los_Vampiros() {
        super(
                "OSCURIDAD",
                "Roca / Efecto",
                "Señor de los Vampiros",
                5,
                """
                        Si esta carta inflige daño de batalla a tu adversario:
                        declara 1 tipo de carta (Monstruo, Mágica o Trampa);
                        tu adversario manda al Cementerio 1 carta de ese tipo en su Deck.
                        Una vez por turno, durante tu próxima Standby Phase
                        después de que esta carta en tu posesión fuera destruida
                        y mandada a tu Cementerio por el efecto de una carta del adversario:
                        Invoca esta carta de Modo Especial desde el Cementerio.
                        """,
                2000,
                1500
        );
    }
}
//por ti oskr