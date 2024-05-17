package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Contraataque_Medio extends Objeto {
    public Contraataque_Medio() {
        super(
                "TRAMPA",
                " ",
                "Contraataque Medio",
                """
                        Durante el cálculo de daño, si un monstruo que controlas está siendo atacado:
                        selecciona ese monstruo que controlas;
                        ese objetivo gana ATK igual a la mitad del ATK original del monstruo atacante,
                        hasta el final de este turno.
                        """);
    }
}
