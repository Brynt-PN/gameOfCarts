package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Cloudian_Ojo_del_Tifón extends Criaturas {

    public Cloudian_Ojo_del_Tifón() {
        super(
                "VIENTO",
                "Aqua / Efecto",
                "Cloudian - Ojo del Tifón",
                8,
                """
                        No puede ser destruido en batalla. Si esta carta está en Posición de
                        Defensa boca arriba, destrúyela. Si esta carta declara un ataque:
                        cambia las posiciones de batalla de todos los monstruos boca arriba,
                        excepto los monstruos "Cloudian".
                        """,
                3000,
                1000
        );
    }
}
//por ti oskr