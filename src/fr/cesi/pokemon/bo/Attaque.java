package fr.cesi.pokemon.bo;

public class Attaque {
    private int id;
    private String nom;
    private int force;

    public Attaque() {
    }

    public Attaque(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
