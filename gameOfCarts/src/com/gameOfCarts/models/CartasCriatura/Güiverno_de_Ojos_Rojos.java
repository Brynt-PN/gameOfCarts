package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Güiverno_de_Ojos_Rojos extends Criaturas {
    public Güiverno_de_Ojos_Rojos() {
        super(
                "VIENTO",
                "Dragón / Efecto",
                "Güiverno de Ojos Rojos",
                4,
                """
                        Una vez por turno, durante tu End Phase:
                        puedes desterrar esta carta en tu Cementerio,
                        y después selecciona 1 monstruo "Ojos Rojos" en tu Cementerio;
                        Invoca ese objetivo de Modo Especial.
                        No puedes Invocar de Modo Normal/Colocar durante el turno
                        en el que activas este efecto.
                        """,
                1800,
                1600
        );
    }
}
//por ti oskr