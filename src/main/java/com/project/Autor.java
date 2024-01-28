package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Autor", uniqueConstraints = { @UniqueConstraint(columnNames = "autorId") })
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autorId", unique = true, nullable = false)
    private long autorId;

    @Column(name = "nom")
    private String nom;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "autorId")
    private Set<Llibre> llibres;


    public Autor() {}

    public Autor(String nom) {
        this.nom = nom;
    }


    public long getAutorId() {
        return autorId;
    }

    public void setAutorId(long autorId) {
        this.autorId = autorId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(Set<Llibre> llibres) {
        this.llibres = llibres;
    }
}