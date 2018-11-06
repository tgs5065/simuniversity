package simuniversity;

/**
	File name: Faculty.java
	@author Timothy Sturgill
	@version 1.01 9/10/2018
*/
public class Faculty extends Employee implements Changeable
{
    String office;
    String officePhone;
    String employmentDate;
    String rank;
    
    public Faculty(String fName, String lName, String phoneNo, String emailAcc, String officeLocation, String officePhoneNum, String employmentDateHired, String ranking)
    {
        super.firstName = fName;
        super.lastName = lName;
        super.phoneNumber = phoneNo;
        super.email = emailAcc;
        
        office = officeLocation;
        officePhone = officePhoneNum;
        employmentDate = employmentDateHired;
        rank = ranking;
    }

    @Override
    public String toString() {
        return "Faculty Class\n=============\n" + super.toString() + "Rank: " + rank + "\n";
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
