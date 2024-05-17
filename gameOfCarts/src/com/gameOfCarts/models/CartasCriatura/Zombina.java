package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Zombina extends Criaturas {
    public Zombina() {
        super(
                "TIERRA",
                "Zombi / Efecto ",
                "Zombina",
                4,
                """
                        Si esta carta en posesión de su dueño es destruida
                        por una carta del adversario: puedes seleccionar 1 monstruo de Nivel 4
                        o menor en tu Cementerio, excepto "Zombina"; Invócalo de Modo Especial.
                        """,
                1400,
                1500
        );
    }
}
//por ti oskr