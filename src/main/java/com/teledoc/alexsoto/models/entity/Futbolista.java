package com.teledoc.alexsoto.models.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "futbolista")
public class Futbolista implements Serializable {
	private static final long serialVersionUID = -1988973685817183974L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idFutbolista;

	@Column(name = "nombreFutbolista")
    private String nombreFutbolista;

	@Column(name = "apellido")
    private String apellido;

	@Column(name = "posicion")
    private String posicion;

	@Column(name = "fecNaciomiento")
	@Temporal(TemporalType.TIMESTAMP)
    private Date fecNaciomiento;

    public Futbolista() {}

    public Futbolista(Integer idFutbolista, String nombreFutbolista, String apellido, String posicion, Date fecNaciomiento) {
        this.idFutbolista       = idFutbolista;
        this.nombreFutbolista   = nombreFutbolista;
        this.apellido           = apellido;
        this.posicion           = posicion;
        this.fecNaciomiento     = fecNaciomiento;
    }

    public Integer getIdFutbolista() {
        return idFutbolista;
    }
    public void setIdFutbolista(Integer idFutbolista) {
        this.idFutbolista = idFutbolista;
    }
    public String getNombreFutbolista() {
        return nombreFutbolista;
    }
    public void setNombreFutbolista(String nombreFutbolista) {
        this.nombreFutbolista = nombreFutbolista;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public Date getFecNaciomiento() {
        return fecNaciomiento;
    }
    public void setFecNaciomiento(Date fecNaciomiento) {
        this.fecNaciomiento = fecNaciomiento;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((fecNaciomiento == null) ? 0 : fecNaciomiento.hashCode());
		result = prime * result + ((idFutbolista == null) ? 0 : idFutbolista.hashCode());
		result = prime * result + ((nombreFutbolista == null) ? 0 : nombreFutbolista.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (fecNaciomiento == null) {
			if (other.fecNaciomiento != null)
				return false;
		} else if (!fecNaciomiento.equals(other.fecNaciomiento))
			return false;
		if (idFutbolista == null) {
			if (other.idFutbolista != null)
				return false;
		} else if (!idFutbolista.equals(other.idFutbolista))
			return false;
		if (nombreFutbolista == null) {
			if (other.nombreFutbolista != null)
				return false;
		} else if (!nombreFutbolista.equals(other.nombreFutbolista))
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Futbolista [idFutbolista=" + idFutbolista + ", nombreFutbolista=" + nombreFutbolista + ", apellido="
				+ apellido + ", posicion=" + posicion + ", fecNaciomiento=" + fecNaciomiento + "]";
	}

    
}
