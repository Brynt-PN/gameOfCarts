package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Rey_Niebla extends Criaturas {
    public Rey_Niebla() {
        super(
                "AGUA",
                "Lanzador de Conjuros / Efecto",
                "Rey Niebla",
                7,
                """
                        Puedes Sacrificar 1 monstruo, o ninguno, para Invocar esta carta
                        de Modo Normal (pero no para Colocarla).
                        El ATK de esta carta se convierte en el ATK original combinado
                        de los monstruos Sacrificados. Ningún jugador puede Sacrificar cartas.
                        """,
                0,
                0
        );
    }
}
//por ti oskr