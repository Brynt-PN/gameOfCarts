package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Peón_de_la_Reina extends Objeto {
    public Peón_de_la_Reina() {
        super(
                "TRAMPA",
                " ",
                "Peón de la Reina",
                """
                        Cuando un monstruo "Amazoness" que controlas destruye un monstruo
                        del adversario en batalla y lo manda al Cementerio:
                        Invoca de Modo Especial, desde tu Deck, 1 monstruo "Amazoness" de Nivel 4 o menor.
                        """);
    }
}
