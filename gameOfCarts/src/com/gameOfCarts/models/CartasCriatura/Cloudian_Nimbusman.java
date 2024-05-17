package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Cloudian_Nimbusman extends Criaturas {

    public Cloudian_Nimbusman() {
        super(
                "AGUA",
                "Hada / Efecto",
                "Cloudian - Nimbusman",
                5,
                """
                        No puede ser destruido en batalla. Si esta carta está en Posición de
                        Defensa boca arriba, destrúyela. Puedes Sacrificar cualquier número
                        de monstruos de AGUA para la Invocación por Sacrificio de esta carta.
                        Si esta carta es Invocada por Sacrificio: ponle 1 Contador de Niebla
                        por cada monstruo de AGUA que Sacrificaste. Esta carta gana 500 ATK
                        por cada Contador de Niebla en el Campo.
                        """,
                1000,
                1000
        );
    }
}
//por ti oskr