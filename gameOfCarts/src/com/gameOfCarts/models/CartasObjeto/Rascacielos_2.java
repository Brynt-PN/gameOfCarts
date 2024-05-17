package com.gameOfCarts.models.CartasObjeto;


import com.gameOfCarts.models.Objeto;

public class Rascacielos_2 extends Objeto {

    //Elimine el primer constructor por que no era necesario, y utilice comillas triples en la descripción
    public Rascacielos_2() {
            super(
                    "MÁGICA",
                    "Campo",
                    "Rascacielos 2 - Ciudad de Héroes",
                    """
                            Una vez por turno, durante tu Main Phase, si controlas esta carta:
                            puedes seleccionar 1 monstruo HÉROE Elemental en tu Cementerio que
                            fuera destruido en batalla y mandado ahí; Invoca ese objetivo
                            de Modo Especial.
                            """);
    }
}
//por ti oskr