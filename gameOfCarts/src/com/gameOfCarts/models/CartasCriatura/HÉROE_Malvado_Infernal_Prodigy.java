package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class HÉROE_Malvado_Infernal_Prodigy extends Criaturas {
    public HÉROE_Malvado_Infernal_Prodigy() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "HÉROE Malvado Infernal Prodigy",
                2,
                """
                        Si no controlas monstruos, puedes Invocar de Modo Especial
                        esta carta (desde tu mano) en Posición de Ataque.
                        Una vez por turno, durante la End Phase,
                        si esta carta fue Sacrificada este turno para Invocar por Sacrificio
                        un monstruo "HÉROE": roba 1 carta.
                        """,
                300,
                600
        );
    }
}
//por ti oskr