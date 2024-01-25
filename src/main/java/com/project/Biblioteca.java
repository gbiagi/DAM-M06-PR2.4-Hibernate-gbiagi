package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bibliotecaId;

    @Column
    private String nom;

    @Column
    private String ciutat;

    @OneToMany
    private List<Llibre> llibres;

    public Biblioteca() {}
    public Biblioteca(int bibliotecaId, String nom, String ciutat, List<Llibre> llibres) {
        this.bibliotecaId = bibliotecaId;
        this.nom = nom;
        this.ciutat = ciutat;
        this.llibres = llibres;
    }

    public int getBibliotecaId() {
        return bibliotecaId;
    }

    public void setBibliotecaId(int bibliotecaId) {
        this.bibliotecaId = bibliotecaId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Llibre> llibres) {
        this.llibres = llibres;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "bibliotecaId=" + bibliotecaId +
                ", nom='" + nom + '\'' +
                ", ciutat='" + ciutat + '\'' +
                ", llibres=" + llibres +
                '}';
    }
}