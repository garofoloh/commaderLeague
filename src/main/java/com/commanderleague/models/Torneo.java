package com.commanderleague.models;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;


@Entity
@Table(name="torneos")
public class Torneo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="torneo_id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="cantJugadores")
    private int cantJugadores;
    @Column(name= "tipoTorneo")
    private String tipoTorneo;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_torneo", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "torneo_id"))
    ArrayList<User> jugadores ;

    public Torneo(){}

    public Torneo(Long id, String nombre, int cantJugadores, String tipoTorneo, ArrayList<User> jugadores) {
        this.id = id;
        this.nombre = nombre;
        this.cantJugadores = cantJugadores;
        this.tipoTorneo = tipoTorneo;
        this.jugadores = jugadores;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public String getTipoTorneo() {
        return tipoTorneo;
    }

    public void setTipoTorneo(String tipoTorneo) {
        this.tipoTorneo = tipoTorneo;
    }

    public ArrayList<User> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<User> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Torneo)) {
            return false;
        }
        Torneo other = (Torneo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.commanderleague.models.Torneo[ id=" + id + " ]";
    }
    
}
