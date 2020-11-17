package com.example.tweet;

public class User {

    private int id ;
    private String firstName ;
    private String familyName ;
    private int avatare ;

    public User(int id, String nom, String prenom, int avatare) {
        this.id = id;
        this.firstName = nom;
        this.familyName = prenom;
        this.avatare = avatare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return firstName;
    }

    public void setNom(String nom) {
        this.firstName = nom;
    }

    public String getPrenom() {
        return familyName;
    }

    public void setPrenom(String prenom) {
        this.familyName = prenom;
    }

    public int getAvatare() {
        return avatare;
    }

    public void setAvatare(int avatare) {
        this.avatare = avatare;
    }
}
