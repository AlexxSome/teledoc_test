package com.teledoc.alexsoto.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "club")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Club implements Serializable {
	private static final long serialVersionUID = -5682439818227906282L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idClub;

	@Column(name = "nombreClub")
    private String nombreClub;

	@Column(name = "pais")
    private String pais;

	@Column(name = "liga")
    private String liga;

	@OneToMany(mappedBy = "club", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Futbolista> futbolistaList;

    public Club() {}

    public Club(Integer idClub, String nombreClub, String pais, String liga) {
        this.idClub     = idClub;
        this.nombreClub = nombreClub;
        this.pais       = pais;
        this.liga       = liga;
    }

    public Integer getIdClub() {
        return idClub;
    }
    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }
    public String getNombreClub() {
        return nombreClub;
    }
    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getLiga() {
        return liga;
    }
    public void setLiga(String liga) {
        this.liga = liga;
    }
	public Set<Futbolista> getFutbolistaList() {
		return futbolistaList;
	}
	public void setFutbolistaList(Set<Futbolista> futbolistaList) {
		this.futbolistaList = futbolistaList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClub == null) ? 0 : idClub.hashCode());
		result = prime * result + ((liga == null) ? 0 : liga.hashCode());
		result = prime * result + ((nombreClub == null) ? 0 : nombreClub.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
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
		Club other = (Club) obj;
		if (idClub == null) {
			if (other.idClub != null)
				return false;
		} else if (!idClub.equals(other.idClub))
			return false;
		if (liga == null) {
			if (other.liga != null)
				return false;
		} else if (!liga.equals(other.liga))
			return false;
		if (nombreClub == null) {
			if (other.nombreClub != null)
				return false;
		} else if (!nombreClub.equals(other.nombreClub))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Club [idClub=" + idClub + ", nombreClub=" + nombreClub + ", pais=" + pais + ", liga=" + liga + "]";
	}

    
}
