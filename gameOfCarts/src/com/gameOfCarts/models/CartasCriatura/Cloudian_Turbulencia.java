package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Cloudian_Turbulencia extends Criaturas {

    public Cloudian_Turbulencia() {
        super(
                "AGUA",
                "Hada / Efecto",
                "Cloudian - Ojo del Tifón",
                4,
                """
                        No puede ser destruido en batalla. Si esta carta está en Posición de
                        Defensa boca arriba, destrúyela. Si esta carta es Invocada de Modo
                        Normal: ponle 1 Contador de Niebla por cada monstruo "Cloudian" en el
                        Campo. Puedes retirar 1 Contador de Niebla de esta carta; Invoca de
                        Modo Especial 1 "Cloudian - Bola de Humo" desde tu Deck o cualquier
                        Cementerio.
                        """,
                800,
                0
        );
    }
}
//por ti oskr