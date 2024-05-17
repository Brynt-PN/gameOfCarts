package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Raviel_Señor_de_Fantasmas extends Criaturas {
    public Raviel_Señor_de_Fantasmas() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "Raviel, Señor de Fantasmas",
                10,
                """
                        No puede ser Invocado de Modo Normal/Colocado.
                        Debe ser Invocado de Modo Especial (desde tu mano)
                        Sacrificando 3 monstruos Demonio.
                        Cada vez que tu adversario Invoca de Modo Normal un monstruo:
                        Invoca de Modo Especial 1 "Ficha de Fantasma"
                        (Demonio/OSCURIDAD/Nivel 1/ATK 1000/DEF 1000),
                        pero ésta no puede declarar ataques. Una vez por turno:
                        puedes Sacrificar 1 monstruo; hasta el final de este turno,
                        esta carta gana ATK igual al ATK original del monstruo Sacrificado.
                        """,
                4000,
                4000
        );
    }
}
//por ti oskr