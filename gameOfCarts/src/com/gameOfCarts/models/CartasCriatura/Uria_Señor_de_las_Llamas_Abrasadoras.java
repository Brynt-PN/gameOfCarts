package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Uria_Señor_de_las_Llamas_Abrasadoras extends Criaturas {
    public Uria_Señor_de_las_Llamas_Abrasadoras() {
        super(
                "FUEGO",
                "Piro / Efecto",
                "Uria Señor de las Llamas Abrasadoras",
                10,
                """
                        No puede ser Invocado de Modo Normal/Colocado. Debe ser Invocado de Modo Especial
                        (desde tu mano) mandando al Cementerio 3 Trampas boca arriba que controles.
                        Esta carta gana 1000 ATK por cada Trampa Continua en tu Cementerio.
                        Una vez por turno: puedes seleccionar 1 Mágica/Trampa Colocada que controle tu adversario;
                        destruye ese objetivo. Ningún jugador puede activar Cartas Mágicas/de Trampa
                        en respuesta a la activación de este efecto.
                        """,
                0,
                0
        );
    }
}
//por ti oskr