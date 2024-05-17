package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class El_Primer_Sarcófago extends Objeto {
    public El_Primer_Sarcófago() {
        super(
                "TRAMPA",
                "Continua",
                "El Primer Sarcófago",
                """
                        Una vez por turno, durante la End Phase de tu adversario:
                        pon 1 "El Segundo Sarcófago" o (después de hacer eso)
                        "El Tercer Sarcófago" desde tu mano o Deck, boca arriba en tu Zona de Magia y Trampas.
                        Después, si controlas "El Primer Sarcófago", "El Segundo Sarcófago"
                        y "El Tercer Sarcófago", mándalos todos al Cementerio y,
                        si lo haces, Invoca de Modo Especial 1 "Espíritu del Faraón" desde tu mano o Deck.
                        Si cualquiera de estas cartas, incluyendo esta carta, deja tu Campo,
                        manda al Cementerio todas ellas que controles, incluyendo esta carta.
                        """);
    }
}//por ti oskr
