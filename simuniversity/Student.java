package simuniversity;

/**
	File name: Student.java
	@author Timothy Sturgill
	@version 1.01 9/10/2018
*/
public class Student extends Person implements Changeable
{
    final String status;
    
    public Student(String fName, String lName, String phoneNum, String emailAcc, String currentStatus)
    {
        super.firstName = fName;
        super.lastName = lName;
        super.phoneNumber = phoneNum;
        super.email = emailAcc;
        status = currentStatus;
    }

    public String getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return "Student Class\n=============\n" + super.toString() + "Status: " + status + "\n";
    }

    @Override
    public void changeName(String firstName, String lastName) 
    {
        if(firstName != "")
            this.firstName = firstName;
        
        if(lastName != "")
            this.lastName = lastName;
    }

}
