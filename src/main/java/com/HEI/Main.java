package com.HEI;

import com.HEI.affirmation.Incertitude;
import com.HEI.affirmation.Mensonge;
import com.HEI.affirmation.ValeurDeVerité;
import com.HEI.affirmation.Verité;

public class Main {

    public static void main(String[] args) {

       	Verité verite = new Verité("Le ciel est bleu par temps clair.");
	Incertitude affirmation = new Incertitude("Certaines personnes préfèrent le ciel bleu pour les activités de plein air.");
	Mensonge mensonge = new Mensonge("Le ciel est toujours bleu, même lorsqu'il pleut.");
	
	ValeurDeVerité valeurDeVerité1 = verite.ou(affirmation).donc(mensonge).valeur();
    	 ValeurDeVerité valeurDeVerité1=  verité.ou(affirmation).donc(mensonge).valeurDeVerité();
        System.out.println(valeurDeVerité1);

        System.out.println(mensonge.ou(affirmation).valeurDeVerité());
        System.out.println(mensonge.et(affirmation).valeurDeVerité());
        System.out.println(mensonge.donc(affirmation).valeurDeVerité());




    }
}
