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

    public boolean vraiOuFaux() {
        boolean premiereVraie = premiereAffirmation.getVraiOuFaux();
        boolean deuxiemeVraie = deuxiemeAffirmation.getVraiOuFaux();

        if (conjonctionDeCoordination == ConjonctionDeCoordination.et) {
            return premiereVraie && deuxiemeVraie;
        } else if (conjonctionDeCoordination == ConjonctionDeCoordination.ou) {
            return premiereVraie || deuxiemeVraie;
        } else if (conjonctionDeCoordination == ConjonctionDeCoordination.donc) {
            return !premiereVraie || deuxiemeVraie;
        } else {
            return false;
        }
    }
}