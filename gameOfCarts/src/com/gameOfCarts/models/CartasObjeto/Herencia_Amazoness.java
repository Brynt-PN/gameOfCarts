package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Herencia_Amazoness extends Objeto {
    public Herencia_Amazoness() {
        super(
                "MÁGICA",
                "Equipo",
                "Herencia Amazoness",
                """
                        Sólo puedes equipar esta carta a un monstruo "Amazoness".
                        La primera vez que el monstruo equipado fuera a ser destruido en batalla cada turno,
                        no es destruido. Después del cálculo de daño,
                        si el monstruo equipado atacó un monstruo: destruye el monstruo atacado.
                        """);
    }
}//por ti oskr
