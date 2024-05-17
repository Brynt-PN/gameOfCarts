package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Génesis_de_Vampiro extends Criaturas {
    public Génesis_de_Vampiro() {
        super(
                "OSCURIDAD",
                "Zombi / Efecto",
                "Génesis de Vampiro",
                8,
                """
                        No puede ser Invocado de Modo Normal/Colocado.
                        Debe ser Invocado de Modo Especial (desde tu mano)
                        desterrando 1 "Señor de los Vampiros" que controles.
                        Una vez por turno: puedes descartar al Cementerio 1 monstruo Zombi,
                        y después seleccionar 1 monstruo Zombi en tu Cementerio
                        con un Nivel menor que el del monstruo Zombi descartado;
                        Invoca ese objetivo de Modo Especial.
                        """,
                3000,
                2100
        );
    }
}
//por ti oskr