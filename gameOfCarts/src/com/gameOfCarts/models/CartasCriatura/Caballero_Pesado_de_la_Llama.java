package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Caballero_Pesado_de_la_Llama extends Criaturas {

    public Caballero_Pesado_de_la_Llama() {
        super(
                "FUEGO",
                "Zombi / Géminis / Efecto",
                "Caballero Pesado de la Llama",
                4,
                """
                        Esta carta se trata como un Monstruo Normal mientras esté boca arriba en el Campo
                        o en el Cementerio. Mientras esta carta sea un Monstruo Normal en el Campo,
                        puedes Invocarla de Modo Normal para que se convierta en un Monstruo de Efecto
                        con este efecto.
                            ●Al comienzo del Damage Step, si esta carta atacó un monstruo Invocado de
                            Modo Especial: puedes desterrar ese monstruo.
                        """,
                1800,
                200
        );
    }
}
//por ti oskr