package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Ladrido_del_Gobernante_Oscuro extends Objeto {
    public Ladrido_del_Gobernante_Oscuro() {
        super(
                "TRAMPA",
                " ",
                "Ladrido del Gobernante Oscuro",
                """
                        Si un monstruo Demonio que controlas batalla, durante el Damage Step:
                        paga LP en múltiplos de 100, y después selecciona
                        el monstruo batallante del adversario; hasta el final de este turno,
                        ese monstruo del adversario pierde esa misma cantidad de ATK y DEF.
                        """);
    }
}//por ti oskr
