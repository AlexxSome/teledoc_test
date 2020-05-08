package com.teledoc.alexsoto.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario", schema = "public")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 3664247984572747765L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

	@Column(name = "nombreUsuario")
    private String nombreUsuario;

	@Column(name = "password")
    private String password;
    
    public Usuario() {}
    
	public Usuario(Integer idUsuario, String nombreUsuario, String password) {
		this.idUsuario 		= idUsuario;
		this.nombreUsuario 	= nombreUsuario;
		this.password 		= password;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
		result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Usuario other = (Usuario) obj;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		if (nombreUsuario == null) {
			if (other.nombreUsuario != null)
				return false;
		} else if (!nombreUsuario.equals(other.nombreUsuario))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsaurio=" + nombreUsuario + ", password=" + password + "]";
	}
    
    
    
}
