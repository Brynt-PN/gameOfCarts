package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Cloudian_Dragón_de_Tormentas extends Criaturas {

    public Cloudian_Dragón_de_Tormentas() {
        super(
                "AGUA",
                "Hada / Efecto",
                "Cloudian - Dragón de Tormentas",
                4,
                """
                        No puede ser Invocado de Modo Normal/Colocado. Debe ser primero Invocado
                        de Modo Especial (desde tu mano) desterrando 1 monstruo "Cloudian" en tu
                        Cementerio. No puede ser destruido en batalla. Si esta carta está en
                        Posición de Defensa boca arriba, destrúyela. Una vez por turno:
                        puedes seleccionar 1 monstruo boca arriba en el Campo; pon 1 Contador
                        de Niebla en ese objetivo.
                        """,
                1000,
                0
        );
    }
}
//por ti oskr