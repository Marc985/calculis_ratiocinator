package com.HEI.affirmation;

public final class Mensonge extends Affirmation {


    public Mensonge(String contenu) {
        super(contenu);
    }

    @Override
    public ValeurDeVerité valeurDeVerité() {
        return ValeurDeVerité.FAUSSE;
    }
}
