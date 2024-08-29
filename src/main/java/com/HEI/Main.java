package com.HEI;

import com.HEI.affirmation.Incertitude;
import com.HEI.affirmation.Mensonge;
import com.HEI.affirmation.ValeurDeVerité;
import com.HEI.affirmation.Verité;

public class Main {

    public static void main(String[] args) {

        Verité verité=new Verité("lou est beau");
        Incertitude affirmation=new Incertitude("Lou est genereux");
        Mensonge mensonge=new Mensonge("lou est pauvre");
     ValeurDeVerité valeurDeVerité1=  verité.ou(affirmation).et(mensonge).valeurDeVerité();
        System.out.println(valeurDeVerité1);

        System.out.println(mensonge.ou(affirmation).valeurDeVerité());



    }
}