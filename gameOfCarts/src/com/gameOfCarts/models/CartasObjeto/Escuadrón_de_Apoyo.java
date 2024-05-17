package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Escuadrón_de_Apoyo extends Objeto {
    public Escuadrón_de_Apoyo() {
        super(
                "MÁGICA",
                "Continua",
                "Escuadrón de Apoyo",
                """
                        Cada vez que recibas 1000 o más puntos de daño por efecto
                        de una carta de tu adversario o el ataque de su monstruo:
                        roba 1 carta por cada 1000 puntos de daño que recibiste.
                        """);
    }
}
