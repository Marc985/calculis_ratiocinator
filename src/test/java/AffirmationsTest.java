import com.HEI.affirmation.Affirmation;
import com.HEI.affirmation.Mensonge;
import com.HEI.affirmation.Verite;
import com.HEI.composition.Compositioins;
import com.HEI.conjonction.ConjonctionDeCoordination;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AffirmationsTest {
    @org.junit.jupiter.api.Test
    public void LouEstBeauOuLouEstGenereuxDoncLouEstPauvre(){
        List<Affirmation> affirmations = new ArrayList<>();
        affirmations.add(new Verite("Lou est beau"));
        affirmations.add(new Affirmation("Lou est généreux"));
        affirmations.add(new Mensonge("Lou est pauvre"));

        List<ConjonctionDeCoordination> conjonctionsDeCoordination = new ArrayList<>();
        conjonctionsDeCoordination.add(ConjonctionDeCoordination.ou);
        conjonctionsDeCoordination.add(ConjonctionDeCoordination.donc);

        Compositioins composition = new Compositioins(affirmations, conjonctionsDeCoordination);
        String resultat = composition.vraiOuFaux();
        assertEquals("faux",resultat);
    }
    @Test
    public void LouEstPauvreOuLouEstGenereux(){
        List<Affirmation> affirmations=new ArrayList<>();
        affirmations.add(new Mensonge("Lou est pauvre"));
        affirmations.add(new Affirmation("Lou est genereux"));
        List<ConjonctionDeCoordination> conjonctionDeCoordinations=new ArrayList<>();
        conjonctionDeCoordinations.add(ConjonctionDeCoordination.ou);
        Compositioins composition = new Compositioins(affirmations,conjonctionDeCoordinations);
        String resultat=composition.vraiOuFaux();
        assertEquals("faux",resultat);
    }
    @Test
    public void LouEstPauvreDoncLouEstGenereux(){
        List<Affirmation> affirmations=new ArrayList<>();
        affirmations.add(new Mensonge("Lou est pauvre"));
        affirmations.add(new Affirmation("Lou est genereux"));
        List<ConjonctionDeCoordination> conjonctionDeCoordinations=new ArrayList<>();
        conjonctionDeCoordinations.add(ConjonctionDeCoordination.donc);
        Compositioins composition = new Compositioins(affirmations,conjonctionDeCoordinations);
        String resultat=composition.vraiOuFaux();
        assertEquals("vrai",resultat);
    }
    @Test

    public void LouEstPauvreEtLouEstGenereux(){
        List<Affirmation> affirmations=new ArrayList<>();
        affirmations.add(new Mensonge("Lou est pauvre"));
        affirmations.add(new Affirmation("Lou est genereux"));
        List<ConjonctionDeCoordination> conjonctionDeCoordinations=new ArrayList<>();
        conjonctionDeCoordinations.add(ConjonctionDeCoordination.et);
        Compositioins composition = new Compositioins(affirmations,conjonctionDeCoordinations);
        String resultat=composition.vraiOuFaux();
        assertEquals("faux",resultat);
    }
}
