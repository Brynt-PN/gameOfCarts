package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Invocar_Nube extends Objeto {
    public Invocar_Nube() {
        super(
                "MÁGICA",
                "Continua",
                "Invocar Nube",
                """
                        Una vez por turno, durante tu Main Phase:
                        puedes Invocar de Modo Especial 1 monstruo "Cloudian"
                        de Nivel 4 o menor desde tu mano o cualquier Cementerio.
                        No debes controlar monstruos para activar y resolver este efecto.
                        Si Invocas de Modo Especial un monstruo desde el Cementerio con este efecto,
                        destruye esta carta.
                        """);
    }
}
