package simuniversity;

/**
	File name: Staff.java
	@author Timothy Sturgill
	@version 1.01 9/10/2018
*/
public class Staff extends Employee
{
    String office;
    String officePhone;
    String employmentDate;
    String title;

    public Staff(String fName, String lName, String phoneNo, String emailAcc, String officeLocation, String officePhoneNum, String employmentDateHired, String currentTitle)
    {
        super.firstName = fName;
        super.lastName = lName;
        super.phoneNumber = phoneNo;
        super.email = emailAcc;
        
        office = officeLocation;
        officePhone = officePhoneNum;
        employmentDate = employmentDateHired;
        title = currentTitle;
    }
    
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff Class\n===========\n" + super.toString() + "Title: " + title + "\n";
    }
    
    
}
