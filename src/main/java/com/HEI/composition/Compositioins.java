package com.HEI.composition;

import com.HEI.affirmation.Affirmation;
import com.HEI.conjonction.ConjonctionDeCoordination;

import java.util.List;

public class Compositioins {
   private final List<Affirmation> affirmations;
    private final List<ConjonctionDeCoordination> conjonctionsDeCoordination;
    public Compositioins(List<Affirmation> affirmations, List<ConjonctionDeCoordination> conjonctionsDeCoordination) {
        this.affirmations = affirmations;
        this.conjonctionsDeCoordination = conjonctionsDeCoordination;
    }
    public String vraiOuFaux() {

        if (affirmations.size() - 1 != conjonctionsDeCoordination.size()) {
            return "jenesaispas";
        }


        boolean resultat = affirmations.get(0).getVraiOuFaux().equals("vrai");


        for (int i = 1; i < affirmations.size(); i++) {
            ConjonctionDeCoordination conjonction = conjonctionsDeCoordination.get(i - 1);
            boolean affirmationCouranteVraie = affirmations.get(i).getVraiOuFaux().equals("vrai");

            if (conjonction == ConjonctionDeCoordination.et) {
                resultat = resultat && affirmationCouranteVraie;
            } else if (conjonction == ConjonctionDeCoordination.ou) {
                resultat = resultat || affirmationCouranteVraie;
            } else if (conjonction == ConjonctionDeCoordination.donc) {
                resultat = (!resultat || affirmationCouranteVraie) ? true : false;
            }
        }

        return resultat ? "vrai" : "faux";
    }




}