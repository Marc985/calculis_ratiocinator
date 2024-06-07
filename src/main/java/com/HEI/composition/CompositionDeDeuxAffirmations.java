package com.HEI.composition;

import com.HEI.affirmation.Affirmation;
import com.HEI.conjonction.ConjonctionDeCoordination;

public class CompositionDeDeuxAffirmations {
    private final Affirmation premiereAffirmation;
    private final ConjonctionDeCoordination conjonctionDeCoordination;
    private final Affirmation deuxiemeAffirmation;
    ;

    public CompositionDeDeuxAffirmations(Affirmation premiereAffirmation
            , ConjonctionDeCoordination conjonctionDeCoordination, Affirmation deuxiemeAffirmation) {
        this.premiereAffirmation = premiereAffirmation;
        this.deuxiemeAffirmation = deuxiemeAffirmation;
        this.conjonctionDeCoordination = conjonctionDeCoordination;

    }


    public String vraiOuFaux() {
        boolean premiereVraie = premiereAffirmation.getVraiOuFaux().equals("vrai");
        boolean deuxiemeVraie = deuxiemeAffirmation.getVraiOuFaux().equals("vrai");


        if (conjonctionDeCoordination == ConjonctionDeCoordination.et) {
            return premiereVraie && deuxiemeVraie?"vrai":"faux";
        } else if (conjonctionDeCoordination == ConjonctionDeCoordination.ou) {
            return premiereVraie || deuxiemeVraie?"vrai":"faux";
        } else if (conjonctionDeCoordination == ConjonctionDeCoordination.donc) {
            return !premiereVraie || deuxiemeVraie?"vrai":"faux";
        }
        return "jenesaispas";
    }

}