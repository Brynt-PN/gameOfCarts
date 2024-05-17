package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Mala_Sangre extends Criaturas {
    public Mala_Sangre() {
        super(
                "OSCURIDAD",
                "Zombi / Géminis / Efecto",
                "Mala Sangre",
                6,
                """
                        Esta carta se trata como un Monstruo Normal mientras esté boca arriba
                        en el Campo o en el Cementerio. Mientras esta carta sea un Monstruo Normal en el Campo,
                        puedes Invocarla de Modo Normal para que se convierta en un Monstruo
                        de Efecto con este efecto.
                        ●Una vez por turno: puedes Invocar de Modo Especial 1 monstruo Zombi
                        desde tu mano o cualquier Cementerio, pero si esta carta deja el Campo,
                        destruye todos los monstruos Zombi Invocados de Modo Especial por este efecto.
                        """,
                2100,
                800
        );
    }
}
//por ti oskr