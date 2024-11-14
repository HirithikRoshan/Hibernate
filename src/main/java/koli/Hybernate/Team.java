package koli.Hybernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(name="My_Database")
public class Team {
	@Id
	String name;
        @Column(name="NewAge")
	int age;
	@Transient
	String role;
	
	//Constructor
	Team(String name,int age,String role)
	{
		this.name=name;
		this.age=age;
		this.role=role;
	}
	
	
}
