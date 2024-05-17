package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Pandemonium extends Objeto {
    public Pandemonium() {
        super(
                "MÁGICA",
                "Campo",
                "Pandemonium",
                """
                        Ningún jugador debe pagar LP durante la Standby Phase por monstruos "Archidemonio".
                        Cuando un monstruo "Archidemonio" es destruido y mandado al Cementerio, excepto en batalla:
                        su dueño puede añadir a su mano 1 monstruo "Archidemonio"
                        en su Deck con un Nivel menor que el de la carta destruida.
                        """);
    }
}
//por ti oskr