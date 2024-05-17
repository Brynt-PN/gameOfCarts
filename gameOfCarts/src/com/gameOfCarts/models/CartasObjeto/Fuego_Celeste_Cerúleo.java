package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Fuego_Celeste_Cerúleo extends Objeto {
    public Fuego_Celeste_Cerúleo() {
        super(
                "MÁGICA",
                "Continua",
                "Fuego Celeste Cerúleo",
                """
                        Para Invocar de Modo Especial "Hamon, Señor del Trueno Golpeador"
                        usando su propio procedimiento, también puedes usar Mágicas boca abajo que controles.
                        Una vez por turno, mientras controlas un "Hamon,
                        Señor del Trueno Golpeador" en Posición de Ataque,
                        puedes negar cualquier efecto de Mágica/Trampa activado por tu adversario,
                        y después cambia 1 "Hamon, Señor del Trueno Golpeador" que controles a Posición de Defensa.
                        Si un "Uria, Señor de las Llamas Abrasadoras", "Hamon, Señor del Trueno Golpeador"
                        o "Raviel, Señor de Fantasmas" boca arriba que controles deja el Campo:
                        este turno no recibes daño.
                        """);
    }
}
