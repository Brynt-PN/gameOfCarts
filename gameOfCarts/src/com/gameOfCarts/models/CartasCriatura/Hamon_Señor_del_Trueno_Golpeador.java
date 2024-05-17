package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Hamon_Señor_del_Trueno_Golpeador extends Criaturas {
    public Hamon_Señor_del_Trueno_Golpeador () {
        super(
                "LUZ",
                "Trueno / Efecto",
                "Hamon, Señor del Trueno Golpeador",
                10,
                """
                        No puede ser Invocado de Modo Normal/Colocado.
                        Debe ser Invocado de Modo Especial (desde tu mano)
                        mandando al Cementerio 3 Mágicas Continuas boca arriba que controles.
                        Si esta carta destruye un monstruo del adversario en batalla
                        y lo manda al Cementerio: inflige 1000 puntos de daño a tu adversario.
                        Mientras esta carta esté en Posición de Defensa boca arriba,
                        los monstruos que controle tu adversario no pueden seleccionar monstruos
                        para ataques, excepto éste.
                        """,
                4000,
                4000
        );
    }
}
//por ti oskr