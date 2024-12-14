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

import com.skilldistillery.jpasmoochyzoo.entities.*;

@Entity
public class Animal 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private LocalDateTime birthday;
	

	@ManyToOne
	@JoinColumn(name="mom_id")
	private Animal mom;
	
	
	@ManyToOne
	@JoinColumn(name="dad_id")
	private Animal dad;

	
	private void Animal()
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


	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", birthday=" + birthday + ", mom=" + mom + ", dad=" + dad + "]";
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
