package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Llamamiento_Oscuro extends Objeto {
    public Llamamiento_Oscuro() {
        super(
                "MÁGICA",
                " ",
                "Llamamiento Oscuro",
                """
                        Invoca por Fusión 1 Monstruo de Fusión desde tu Deck Extra,
                        que deba ser Invocado de Modo Especial con "Fusión Oscura",
                        desterrando de tu mano y/o Cementerio los Materiales de Fusión mencionados en él.
                        (Esto se trata como una Invocación por Fusión con "Fusión Oscura").
                        """);
    }
}
