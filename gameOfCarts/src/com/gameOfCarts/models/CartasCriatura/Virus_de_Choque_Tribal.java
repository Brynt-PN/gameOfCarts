package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Virus_de_Choque_Tribal extends Criaturas {
    public Virus_de_Choque_Tribal() {
        super(
                "AGUA",
                "Trueno / Efecto",
                "Virus de Choque Tribal",
                4,
                """
                        Una vez por turno: puedes desterrar 1 monstruo en tu mano;
                        destruye todos los monstruos boca arriba en el Campo
                        del mismo Tipo que ese monstruo.
                        """,
                1700,
                1000
        );
    }
}
//por ti oskr