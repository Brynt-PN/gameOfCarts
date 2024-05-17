package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Cloudian_Cirrostratus extends Criaturas {

    public Cloudian_Cirrostratus() {
        super(
                "AGUA",
                "Hada / Efecto",
                "Cloudian - Cirrostratus",
                4,
                """
                        No puede ser destruido en batalla. Si esta carta está en Posición de Defensa
                        boca arriba, destrúyela. Si esta carta es Invocada de Modo Normal: ponle 1
                        Contador de Niebla por cada monstruo "Cloudian" en el Campo. Puedes retirar
                        2 Contadores de Niebla de esta carta, y después selecciona 1 monstruo en el
                        Campo; destruye ese objetivo.
                        """,
                900,
                0
        );
    }
}
//por ti oskr