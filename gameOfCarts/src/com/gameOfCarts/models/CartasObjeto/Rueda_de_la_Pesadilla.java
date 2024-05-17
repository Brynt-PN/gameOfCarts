package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Rueda_de_la_Pesadilla extends Objeto {
    public Rueda_de_la_Pesadilla() {
        super(
                "TRAMPA",
                "Continua",
                "Rueda de la Pesadilla",
                """
                        Activa esta carta seleccionando 1 monstruo que controle tu adversario;
                        éste no puede atacar o cambiar su posición de batalla.
                        Cuando deje el Campo, destruye esta carta. Una vez por turno,
                        durante tu Standby Phase: inflige 500 puntos de daño a tu adversario.
                        Ese monstruo debe estar en el Campo para activar y resolver este efecto.
                        """);
    }
}//por ti oskr
