package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Zoma_de_Calavera extends Objeto {
    public Zoma_de_Calavera() {
        super(
                "TRAMPA",
                "Continua",
                "Zoma de Calavera",
                """
                        Invoca esta carta de Modo Especial en Posición de Defensa
                        como un Monstruo de Efecto (Zombi/OSCURIDAD/Nivel 4/ATK 1800/DEF 500).
                        (Esta carta también sigue siendo una Trampa).
                        Si esta carta Invocada de esta forma es destruida en batalla:
                        inflige daño a tu adversario igual al ATK del monstruo que la destruyó.
                        """);
    }
}
