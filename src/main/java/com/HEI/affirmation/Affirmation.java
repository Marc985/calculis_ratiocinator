package com.HEI.affirmation;


public sealed abstract class Affirmation permits Mensonge, Incertitude,Verité {
    private final String contenu;

    public Affirmation(String contenu){
        this.contenu=contenu;

    }
public abstract ValeurDeVerité valeurDeVerité();

  public Affirmation et(Affirmation deuxiemeAffirmation){
        if(this instanceof Verité && deuxiemeAffirmation instanceof  Verité){
            return new Verité(this.contenu+"et"+deuxiemeAffirmation.contenu);
        }
        else if (this instanceof Incertitude && deuxiemeAffirmation instanceof Incertitude) {
            return new Incertitude(this.contenu+"et"+deuxiemeAffirmation.contenu);
        }
        else
            return new Mensonge(this.contenu+"et"+deuxiemeAffirmation.contenu);
  }
  public Affirmation ou(Affirmation deuxiemeAffirmation){
      if(this instanceof  Verité || deuxiemeAffirmation instanceof Verité){
          return new Verité(this.contenu+"ou"+deuxiemeAffirmation.contenu);
      } else if (this instanceof Incertitude&&deuxiemeAffirmation instanceof Mensonge) {
          return new Incertitude(this.contenu+"ou"+deuxiemeAffirmation.contenu);


      }
      else if(this instanceof  Mensonge&&deuxiemeAffirmation instanceof Incertitude)
          return new Incertitude(this.contenu+"ou"+deuxiemeAffirmation.contenu);
      else
          return new Mensonge(this.contenu+"ou"+deuxiemeAffirmation.contenu);
  }
    public Affirmation donc(Affirmation deuxiemeAffirmation){
      if(this instanceof Verité && deuxiemeAffirmation instanceof Mensonge){
          return new Mensonge(this.contenu+"donc"+deuxiemeAffirmation.contenu);
      }
      else if(this instanceof  Incertitude && deuxiemeAffirmation instanceof Mensonge)
          return new Incertitude(this.contenu+"donc"+deuxiemeAffirmation.contenu);
      else
          return new Verité(this.contenu+"donc"+deuxiemeAffirmation.contenu);
    }
}
