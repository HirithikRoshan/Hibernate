package koli.Hybernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Team {
	@Id
	String name;
	int age;
	String role;
	
	//Constructor
	Team(String name,int age,String role)
	{
		this.name=name;
		this.age=age;
		this.role=role;
	}
	
	
}
