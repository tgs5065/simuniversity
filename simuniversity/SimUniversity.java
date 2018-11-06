package simuniversity;

import java.util.ArrayList;


/**
	File name: main.java 
	@author Timothy Sturgill
	@version 1.01 9/10/2018
*/
public class SimUniversity      
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Tom", "Jones", "352-235-1092", "tj@gmail.com", "Senior");
        Faculty faculty1 = new Faculty("Bob", "Ross", "234-204-1034", "happylittletree@gmail.com", "Floor 3", "102-823-2094", "April 4th, 1976", "Head Painter");
        Staff staff1 = new Staff("George", "Dubyuh", "101-010-1001", "bushmaster9000@aol.com", "Floor 69", "734-201-8008", "January 20,2001", "President");

        ArrayList<Object> people = new ArrayList<Object>();
        
        people.add(student1);
        people.add(faculty1);
        people.add(staff1);
        
        for(int i = 0; i < people.size(); i++)
        {
            System.out.println(people.get(i).toString());
        }
        
        student1.changeName("", "Stevenson");
        faculty1.changeName("Robert", "");
        
        System.out.println(student1.toString());
        System.out.println(faculty1.toString());
        
        student1.changeName("Mr.", "Anderson");
        
        System.out.println(student1.toString());
    }    
}
