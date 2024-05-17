package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Velo_de_Oscuridad extends Objeto {
    public Velo_de_Oscuridad() {
        super(
                "MÁGICA",
                "Continua",
                "Velo de Oscuridad",
                """
                        Durante tu Draw Phase, si robaste uno o más monstruos de OSCURIDAD:
                        puedes mostrar cualquier número de éstos; mándalos al Cementerio,
                        y después puedes robar 1 carta más.
                        """);
    }
}
//por ti oskr