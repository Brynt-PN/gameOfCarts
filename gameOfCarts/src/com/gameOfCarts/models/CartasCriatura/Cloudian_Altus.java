package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Cloudian_Altus extends Criaturas {

    public Cloudian_Altus() {
        super(
                "AGUA",
                "Hada / Efecto",
                "Cloudian - Altus",
                4,
                """
                        No puede ser destruido en batalla. Si esta carta está en Posición de Defensa boca
                        arriba, destrúyela. Si esta carta es Invocada de Modo Normal: ponle 1 Contador de
                        Niebla por cada monstruo "Cloudian" en el Campo. Puedes retirar 3 Contadores de
                        Niebla de cualquier lugar del Campo; descarta 1 carta al azar de la mano de tu
                        adversario.
                        """,
                1300,
                0
        );
    }
}
//por ti oskr