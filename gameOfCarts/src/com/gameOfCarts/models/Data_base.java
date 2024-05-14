package com.gameOfCarts.models;

import com.gameOfCarts.models.CartasCriatura.HÉROE_Elemental_Avian;
import com.gameOfCarts.models.CartasObjeto.Rascacielos_2;

import java.util.ArrayList;
import java.util.Objects;

public class Data_base {


    public ArrayList<Objects> SaveCardCri(){
        ArrayList Cri=new ArrayList();
        //Declarar Carta de la clase Criaturas;
        HÉROE_Elemental_Avian HEA =new HÉROE_Elemental_Avian();
        //Añadir carta a Gcards
        Cri.add(HEA);
        return Cri;
    }
    public ArrayList<Objects> SaveCardObj(){
        ArrayList Obj=new ArrayList();
        //Declarar Carta de la clase Objeto;
        Rascacielos_2 R2 =new Rascacielos_2();
        //Añadir carta a Gcards
        Obj.add(R2);
        return Obj;
    }

    public ArrayList<Object> CrossOver(){
        ArrayList<Object> crossover = new ArrayList<>();
        for(Object card : SaveCardCri()){
            crossover.add(card);
        }
        for(Object card : SaveCardObj()){
            crossover.add(card);
        }
        return crossover;
    }


    public void ShowDataCri(){
        Criaturas objA;
        Objeto objB;
        for(Object card : CrossOver()){
            if(card instanceof Criaturas){
                objA= (Criaturas) card;
                objA.Mostrar_datos();
            }else if(card instanceof Objeto){
                objB= (Objeto) card;
                objB.Mostrar_datos();
            }
        }
    }

}
