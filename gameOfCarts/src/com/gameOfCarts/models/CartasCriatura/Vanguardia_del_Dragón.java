package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Vanguardia_del_Dragón extends Criaturas {
    public Vanguardia_del_Dragón() {
        super(
                "TIERRA",
                " Dragón / Efecto",
                "Vanguardia del Dragón",
                3,
                """
                        Puedes mandar al Cementerio 1 monstruo Dragón en tu mano;
                        esta carta gana 300 ATK. Cuando esta carta que controlas es mandada
                        a tu Cementerio por efecto de una carta del adversario:
                        puedes seleccionar 1 Monstruo Normal Dragón en cualquier Cementerio;
                        Invoca ese objetivo de Modo Especial.
                        """,
                1700,
                1300
        );
    }
}
//por ti oskr