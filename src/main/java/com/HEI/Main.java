package com.HEI;

import com.HEI.affirmation.Affirmation;
import com.HEI.affirmation.Mensonge;
import com.HEI.affirmation.Verite;
import com.HEI.composition.CompositionDeDeuxAffirmations;
import com.HEI.conjonction.ConjonctionDeCoordination;

public class Main {

    public static void main(String[] args) {
        Verite verite1=new Verite("Lou est beau");
        Mensonge mensonge1=new Mensonge("Lou est pauvre");
        Affirmation affirmation1=new Affirmation("Lou est genereux");
        CompositionDeDeuxAffirmations compositionDeDeuxAffirmations=new
                CompositionDeDeuxAffirmations(verite1,
                ConjonctionDeCoordination.donc,mensonge1);
        System.out.println(compositionDeDeuxAffirmations.vraiOuFaux());
    }
}