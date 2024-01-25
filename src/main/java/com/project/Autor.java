package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int autorId;

    @Column
    private String nom;

    @OneToMany
    private List<Llibre> llibres;

    public Autor() {}

    public Autor(int autorId, String nom, List<Llibre> llibres) {
        this.autorId = autorId;
        this.nom = nom;
        this.llibres = llibres;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Llibre> llibres) {
        this.llibres = llibres;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "autorId=" + autorId +
                ", nom='" + nom + '\'' +
                ", llibres=" + llibres +
                '}';
    }
}