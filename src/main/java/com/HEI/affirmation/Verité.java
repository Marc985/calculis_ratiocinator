package com.HEI.affirmation;

public final class Verité extends Affirmation {
    public Verité(String contenu) {
        super(contenu);
    }

    @Override
    public ValeurDeVerité valeurDeVerité() {
        return ValeurDeVerité.VRAI;
    }
}
