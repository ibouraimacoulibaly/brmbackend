package com.brm.brmbank.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Scope("session")
@Table(name="users")
public class Utilisateur  implements UserDetails {
	public static enum Profil{ Admin }
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idUtilisateur;
	
	@Column(name="nom")
    private String nom;
	
	@Column(unique = true, nullable = false)
    private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="fonction")
    private String fonction;
	
	
	@Column(unique = true, nullable = false)
    private String email;
	
	@Column(name="prenom")
    private String prenom;
	
	@Column(unique = true, nullable = false)
    private String matricule;

	@Column(name="departement")
    private String departement;
	
	@Column(name="telephone")
    private String telephone;
	
	@Column(name="profil")
    private String profil;

	@Column(name = "status")
	private  String status;

	public Utilisateur() {

	}

	protected Utilisateur(long idUtilisateur, String nom, String username, String fonction, String email,
			String departement, String telephone, String profil, String prenom, String matricule, String status, String password) {
		
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.username = username;
		this.fonction = fonction;
		this.email = email;
		this.departement = departement;
		this.telephone = telephone;
		this.profil = profil;
		this.prenom = prenom;
		this.matricule = matricule;
		this.status = status;
		this.password = password;
		
	}

	public long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUsername() {
		return username;
	}
	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isEnabled() {
		return true;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}
	@JsonIgnore
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(profil));
		return authorities;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", username=" + username + ", password="
				+ password + ", fonction=" + fonction + ", email=" + email + ", prenom=" + prenom + ", matricule="
				+ matricule + ", departement=" + departement + ", telephone=" + telephone + ", profil=" + profil
				+ ", status=" + status + "]";
	}

	

}
