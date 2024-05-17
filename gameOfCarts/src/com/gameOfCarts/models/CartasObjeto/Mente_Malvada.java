package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Mente_Malvada extends Objeto {
    public Mente_Malvada() {
        super(
                "MÁGICA",
                " ",
                "Mente Malvada",
                """
                        Si controlas un monstruo Demonio: activa 1 de estos efectos,
                        basado en el número de monstruos en el Cementerio de tu adversario;
                        ●1+: Roba 1 carta.
                        ●4+: Añade a tu mano 1 monstruo "HÉROE" o 1 "Fusión Oscura" en tu Deck.
                        ●10+: Añade a tu mano 1 Mágica "Polimerización" o 1 Mágica "Fusión" en tu Deck.
                        Sólo puedes activar 1 "Mente Malvada" por turno.
                        """);
    }
}
