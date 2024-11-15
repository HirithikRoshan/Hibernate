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
/*
Added some parameter as object
	
package koli.Hibernate_ORM;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Transient;

@Entity(name="My_Team")
public class Team {
    @Id
    private int id;
    private Name name;
    @Column(name="NewAge")
    private int age;
    //@Transient
    private String role;

    // Default constructor required by Hibernate
    public Team() {}

    // Parameterized constructor
    public Team(int id,Name name, int age, String role) {
        this.id = id;
        this.name=name;
        this.age = age;
        this.role = role;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setName(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;

    }
}
*/
