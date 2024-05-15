package com.gameOfCarts.models;

import java.util.ArrayList;
import java.util.List;

public class Data_base {

    private List<Criaturas> cardCri = new ArrayList<>();
    private List<Objeto> cardObj = new ArrayList<>();
    private List<Cartas> cardCrossOver = new ArrayList<>();

    //Guarda los datos de la clase Criaturas en un ArrayList.
    public void SaveCardCri(Criaturas criaturas){
        this.cardCri.add(criaturas);
        this.cardCrossOver.add(criaturas);
    }

    //Guarda los datos de la clase Objeto en un ArrayList.
    public void SaveCardObj(Objeto objeto) {
        this.cardObj.add(objeto);
        this.cardCrossOver.add(objeto);
    }

    //Recorde que show era mostrar en ingles XD
    //el if con instanceof sirve para preguntar si la el elemento de la lista card es una instancia de Criaturas o Objeto 
    public void ShowDataCri() {
        for (Cartas car : this.cardCrossOver){
            System.out.println(car);
        }
    }

}
