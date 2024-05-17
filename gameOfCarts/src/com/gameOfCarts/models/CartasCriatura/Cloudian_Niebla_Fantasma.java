package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Cloudian_Niebla_Fantasma extends Criaturas {

    public Cloudian_Niebla_Fantasma() {
        super(
                "AGUA",
                "Demonio / Efecto",
                "Cloudian - Niebla Fantasma",
                1,
                """
                        No puede ser Invocado de Modo Especial. Ningún jugador recibe daño de
                        batalla de ataques que involucren esta carta. Si esta carta es
                        destruida en batalla: distribuye Contadores de Niebla igual al Nivel
                        del monstruo que la destruyó, entre los monstruos boca arriba.
                        """,
                0,
                0
        );
    }
}
//por ti oskr