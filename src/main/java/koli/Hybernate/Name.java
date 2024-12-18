package koli.Hibernate_ORM;

import jakarta.persistence.Embeddable;
// Without creating new table add into other table
@Embeddable
public class Name {
          
	private String fname;
    private String lname;
    
	public Name(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public Name() {
	}

	public String getFname() {
	 return fname;
	}
	public void setFname(String fname) {
	 this.fname = fname;
	}
	public String getLname() {
	 return lname;
	}
	public void setLname(String lname) {
	 this.lname = lname;
	}

}
