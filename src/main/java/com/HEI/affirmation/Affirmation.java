package com.HEI.affirmation;

public sealed class Affirmation permits Mensonge,Verite{
  private  String contenu;
   private String vraiOuFaux;
   public void setVrai(){
        this.vraiOuFaux="vrai";
    }
   public void setFausse(){
        this.vraiOuFaux="faux";
    }
    public String getVraiOuFaux(){
       return this.vraiOuFaux;
    }

    public Affirmation(String contenu){
        this.contenu=contenu;
        this.vraiOuFaux="jenesaispas";
    }


}
