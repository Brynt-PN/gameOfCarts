package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Paraíso_Perdido extends Objeto {
    public Paraíso_Perdido() {
        super(
                "MÁGICA",
                "Campo",
                "Paraíso Perdido",
                """
                        Tu adversario no puede seleccionar con efectos de cartas a
                        "Uria, Señor de las Llamas Abrasadoras", "Hamon, Señor del Trueno Golpeador",
                        "Raviel, Señor de Fantasmas" o "Armityle, el Fantasma del Caos"
                        en tus Zonas de Monstruos, y además esos monstruos no pueden ser destruidos
                        por efectos de cartas de tu adversario mientras los controles.
                        Si controlas "Uria, Señor de las Llamas Abrasadoras",
                        "Hamon, Señor del Trueno Golpeador", "Raviel, Señor de Fantasmas"
                        o "Armityle, el Fantasma del Caos" en tu Zona de Monstruos:
                        puedes robar 2 cartas. Sólo puedes usar este efecto de "Paraíso Perdido"
                        una vez por turno.
                        """);
    }
}//por ti oskr
