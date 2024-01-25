package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
public class Llibre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int llibreId;

    @Column
    private String nom;

    @Column
    private String editoral;

    @Column
    private int id_autor;

    @ManyToMany
    private List<Biblioteca> biblioteques;

    @ManyToOne
    private Persona persona;

    public Llibre() {}

    public Llibre(int llibreId, String nom, String editoral, int id_autor, List<Biblioteca> biblioteques, Persona persona) {
        this.llibreId = llibreId;
        this.nom = nom;
        this.editoral = editoral;
        this.id_autor = id_autor;
        this.biblioteques = biblioteques;
        this.persona = persona;
    }

    public int getLlibreId() {
        return llibreId;
    }

    public void setLlibreId(int llibreId) {
        this.llibreId = llibreId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEditoral() {
        return editoral;
    }

    public void setEditoral(String editoral) {
        this.editoral = editoral;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public List<Biblioteca> getBiblioteques() {
        return biblioteques;
    }

    public void setBiblioteques(List<Biblioteca> biblioteques) {
        this.biblioteques = biblioteques;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Llibre{" +
                "llibreId=" + llibreId +
                ", nom='" + nom + '\'' +
                ", editoral='" + editoral + '\'' +
                ", id_autor=" + id_autor +
                ", biblioteques=" + biblioteques +
                ", persona=" + persona +
                '}';
    }
}
