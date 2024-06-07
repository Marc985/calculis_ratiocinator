package com.HEI;

import com.HEI.affirmation.Affirmation;
import com.HEI.affirmation.Mensonge;
import com.HEI.affirmation.Verite;
import com.HEI.composition.Compositioins;
import com.HEI.conjonction.ConjonctionDeCoordination;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Affirmation> affirmations = new ArrayList<>();
        affirmations.add(new Verite("Lou est beau"));
        affirmations.add(new Affirmation("Lou est généreux"));
        affirmations.add(new Mensonge("Lou est pauvre"));

        List<ConjonctionDeCoordination> conjonctionsDeCoordination = new ArrayList<>();
        conjonctionsDeCoordination.add(ConjonctionDeCoordination.ou);
        conjonctionsDeCoordination.add(ConjonctionDeCoordination.donc);

        Compositioins composition = new Compositioins(affirmations, conjonctionsDeCoordination);
        String resultat = composition.vraiOuFaux();
        System.out.println("Résultat : " + resultat);
    }
}