package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Puerta_a_Otra_Dimensión extends Objeto {
    public Puerta_a_Otra_Dimensión() {
        super(
                "MÁGICA",
                "Continua",
                "Puerta a Otra Dimensión",
                """
                        Activa esta carta seleccionando 1 monstruo en cada Campo;
                        destierra esos objetivos. Cuando esta carta es destruida y mandada al Cementerio:
                        devuelve al Campo esos monstruos desterrados en la misma posición
                        de batalla en la que estaban.
                        """);
    }
}
//por ti oskr