package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Pared_de_Disrupción extends Objeto {
    public Pared_de_Disrupción() {
        super(
                "TRAMPA",
                " ",
                "Pared de Disrupción",
                """
                       Cuando un monstruo del adversario declara un ataque:
                       todos los monstruos en Posición de Ataque que controle
                       tu adversario en este momento pierden 800 ATK por cada monstruo que controle.
                        """);
    }
}
