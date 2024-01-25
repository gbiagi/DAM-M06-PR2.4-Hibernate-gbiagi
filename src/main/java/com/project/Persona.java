package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personaId;

    @Column
    private String dni;

    @Column
    private String nom;

    @Column
    private String telefon;

    @OneToMany
    private List<Llibre> llibres;

    public Persona() {}

    public Persona(int personaId, String dni, String nom, String telefon, List<Llibre> llibres) {
        this.personaId = personaId;
        this.dni = dni;
        this.nom = nom;
        this.telefon = telefon;
        this.llibres = llibres;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Llibre> llibres) {
        this.llibres = llibres;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "personaId=" + personaId +
                ", dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", telefon='" + telefon + '\'' +
                ", llibres=" + llibres +
                '}';
    }
}