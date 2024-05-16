package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Espejador_del_Pantano extends Objeto {
    public Espejador_del_Pantano() {
        super(
                "TRAMPA",
                "Continua",
                "Espejador del Pantano",
                """
                        Activa esta carta declarando 1 Tipo de Monstruo y 1 Atributo;
                        Invoca esta carta de Modo Especial como un Monstruo Normal
                        (Nivel 4/ATK 1800/DEF 1000) con ese Tipo y Atributo.
                        (Esta carta también sigue siendo una Trampa).
                        """);
    }
}
