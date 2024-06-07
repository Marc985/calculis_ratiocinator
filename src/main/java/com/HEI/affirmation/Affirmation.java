package com.HEI.affirmation;

public sealed class Affirmation permits Mensonge,Verite{
  private   String contenu;
   private boolean vraiOuFaux;
   public void setVrai(){
        this.vraiOuFaux=true;
    }
   public   void setFausse(){
        this.vraiOuFaux=false;
    }
    public boolean getVraiOuFaux(){
       return this.vraiOuFaux;
    }

    public Affirmation(String contenu){
        this.contenu=contenu;
    }


}
