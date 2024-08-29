package com.HEI.affirmation;

public final class Incertitude extends Affirmation {
    public Incertitude(String contenu) {
        super(contenu);
    }

    @Override
    public ValeurDeVerité valeurDeVerité() {
        return ValeurDeVerité.JENESAISPAS;
    }
}
