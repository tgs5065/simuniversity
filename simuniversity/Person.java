package simuniversity;

/**
	File name: Person.java
	@author Timothy Sturgill
	@version 1.01 9/10/2018
*/
public abstract class Person
{

    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n";
    }
    
    
}
