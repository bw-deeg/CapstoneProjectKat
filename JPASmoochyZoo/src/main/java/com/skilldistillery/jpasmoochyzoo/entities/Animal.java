package com.skilldistillery.jpasmoochyzoo.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.skilldistillery.jpasmoochyzoo.entities.*;

@Entity
@Table(name="animal")
public class Animal 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private LocalDateTime birthday;
	
	private String gender;
	
	private boolean isActive = false;
	

	@ManyToOne
	@JoinColumn(name="mom_id")
	private Animal mom;
	
	
	@ManyToOne
	@JoinColumn(name="dad_id")
	private Animal dad;

	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="species_id")
	private Species species;
	
	public Animal()
	{
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDateTime getBirthday() {
		return birthday;
	}


	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}


	public Animal getMom() {
		return mom;
	}


	public void setMom(Animal mom) {
		this.mom = mom;
	}


	public Animal getDad() {
		return dad;
	}


	public void setDad(Animal dad) {
		this.dad = dad;
	}

	

	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}

	
	public Species getSpecies() {
		return species;
	}


	public void setSpecies(Species species) {
		this.species = species;
	}

	

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", isActive="
				+ isActive + ", mom=" + mom + ", dad=" + dad + ", category=" + category + ", species=" + species + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return id == other.id;
	}

	
	
} // end class Animal
