package fr.cesi.pokemon.bo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoTest {
    Dresseur sasha = new Dresseur("Du Bourg-Palette", "Sasha");
    Pokemon pikachu = new Pokemon(25, "Pikachu", 6.0f, 0.4f, new Attaque("Statik", 25), new Attaque("Paratonnerre", 55), sasha);


    @Test
    void dresseur() {
        assertEquals(sasha.getPrenom(), "Sasha");
        assertEquals(sasha.getNom(), "Du Bourg-Palette");
        sasha.setPrenom("Bob");
        assertEquals(sasha.getPrenom(), "Bob");
        sasha.setNom("Sponge");
        assertEquals(sasha.getNom(), "Sponge");
    }

    @Test
    void attaque(){
        pikachu.getAttaque01().setNom("Éclair");
        pikachu.getAttaque01().setForce(40);
        assertEquals(pikachu.getAttaque01().getNom(), "Éclair");
        assertEquals(pikachu.getAttaque01().getForce(), 40);
    }

    @Test
    void pokemon() {
        Pokemon test = new Pokemon(0,"Test",1f,1f,new Attaque("Fail",0),new Attaque("Epic Fail",-10),new Dresseur("toto","tata"));
        test.setId(1);
        test.setNom("Bulbizarre");
        test.setPoids(10.2f);
        test.setTaille(1.3f);
        test.setAttaque01(new Attaque("Charge", 40));
        test.setAttaque02(new Attaque("Rugissement",0));
        test.setDresseur(sasha);
        test.setDesign("\"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png\"");

        assertEquals(test.getId(), 1);
        assertEquals(test.getNom(),"Bulbizarre");
        assertEquals(test.getPoids(), 10.2f);
        assertEquals(test.getTaille(), 1.3f);
        assertEquals(test.getAttaque01().getNom(), "Charge");
        assertEquals(test.getAttaque02().getForce(), 0);
        assertEquals(test.getDresseur().getPrenom(), "Sasha");
        assertEquals(test.getDesign(), "\"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png\"");

        //----        ----\\
        assertEquals(pikachu.getNom(), "Pikachu");
        assertEquals(pikachu.getAttaque01().getNom(), "Statik");
        assertEquals(pikachu.getDesign(), "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png");
    }


}