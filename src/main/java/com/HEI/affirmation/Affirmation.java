package com.HEI.affirmation;


public sealed abstract class Affirmation permits Mensonge, Incertitude,Verité {
    private String contenu;

    public Affirmation(String contenu){
        this.contenu=contenu;

    }
public abstract ValeurDeVerité valeurDeVerité();
  public Affirmation et(Affirmation affirmation){
        if(this.valeurDeVerité().equals(ValeurDeVerité.VRAI)
                &&affirmation.valeurDeVerité().equals(ValeurDeVerité.VRAI)){
            return new Verité(this.contenu+"et"+affirmation.contenu);
        } else if (this.valeurDeVerité().equals(ValeurDeVerité.JENESAISPAS)&&affirmation.valeurDeVerité().equals(ValeurDeVerité.JENESAISPAS)) {
            return new Incertitude(this.contenu+"et"+affirmation.contenu);
        }
        else
            return new Mensonge(this.contenu+"et"+affirmation.contenu);
  }
  public Affirmation ou(Affirmation deuxiemeAffirmation){
      if(this.valeurDeVerité().equals(ValeurDeVerité.VRAI)||deuxiemeAffirmation.valeurDeVerité().equals(ValeurDeVerité.VRAI)){
          return new Verité(this.contenu+"ou"+deuxiemeAffirmation.contenu);
      } else if (this.valeurDeVerité().equals(ValeurDeVerité.JENESAISPAS)&&deuxiemeAffirmation.valeurDeVerité().equals(ValeurDeVerité.FAUSSE)) {
          return new Incertitude(this.contenu+"ou"+deuxiemeAffirmation.contenu);


      }
      else if(this.valeurDeVerité().equals(ValeurDeVerité.FAUSSE)&&deuxiemeAffirmation.valeurDeVerité().equals(ValeurDeVerité.JENESAISPAS))
          return new Incertitude(this.contenu+"ou"+deuxiemeAffirmation.contenu);
      else
          return new Mensonge(this.contenu+"ou"+deuxiemeAffirmation.contenu);
  }
    public Affirmation donc(Affirmation deuxiemeAffirmation){
      if(this.valeurDeVerité().equals(ValeurDeVerité.VRAI)&&deuxiemeAffirmation.valeurDeVerité().equals(ValeurDeVerité.FAUSSE)){
          return new Mensonge(this.contenu+"donc"+deuxiemeAffirmation.contenu);
      }
      else if(this.valeurDeVerité().equals(ValeurDeVerité.JENESAISPAS)&&deuxiemeAffirmation.valeurDeVerité().equals(ValeurDeVerité.FAUSSE))
          return new Incertitude(this.contenu+"donc"+deuxiemeAffirmation.contenu);
      else
          return new Verité(this.contenu+"donc"+deuxiemeAffirmation.contenu);
    }
}
