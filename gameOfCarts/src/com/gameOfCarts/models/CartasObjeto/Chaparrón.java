package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Chaparrón extends Objeto {
    public Chaparrón() {
        super(
                "TRAMPA",
                " ",
                "haparrón",
                """
                        Selecciona 1 monstruo "Cloudian" que controles; reduce su ATK en exactamente 1000 o 2000 puntos y,
                        si lo haces, aplica el efecto apropiado.
                        ●1000: Destruye 1 Mágica/Trampa que controle tu adversario.
                        ●2000: Destruye 2 cartas que controle tu adversario.
                        """);
    }
}
//por ti oskr