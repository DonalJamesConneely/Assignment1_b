package partB;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import partA.*;

public class ProjectDrive
{
    public static void main(String args[])
    {
        //Initialise the Variables.
        ArrayList<Student> stud = new ArrayList<Student>();
        
        Student s1 = new Student("Bill", "21", "15379999", LocalDate.parse("1997-07-01"));
        stud.add(s1);
        Student s2 = new Student("Tom", "19", "15379555", LocalDate.parse("1999-12-10"));
        stud.add(s2);
        Student s3 = new Student("Sam", "20", "1546772", LocalDate.parse("1998-01-20"));
        stud.add(s3);
        Student s4 = new Student("Jack", "21", "1546773", LocalDate.parse("1997-08-01"));
        stud.add(s4);
        Student s5 = new Student("Jill", "22", "1527661", LocalDate.parse("1996-11-15"));
        stud.add(s5);
        Student s6 = new Student("Carl", "21", "1537111", LocalDate.parse("1997-03-11"));
        stud.add(s6);

        Module m1 = new Module("Software Eng", "CT417");
        Module m2 = new Module("Machine Learning", "CT475");
        Module m3 = new Module("Communication Systems", "EE444");

        Course c1 = new Course("Electronic Engineering", LocalDate.parse("2018-09-10"), LocalDate.parse("2019-05-10"));
        Course c2 = new Course("IT", LocalDate.parse("2018-09-10"), LocalDate.parse("2019-05-10"));
        
        
        //Setup Module 1.
        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.addStudent(s3);
        m1.addStudent(s4);
        
        //Setup Module 2.
        m2.addStudent(s5);
        m2.addStudent(s6);
        m2.addStudent(s3);
        m2.addStudent(s4);
        
        //Setup Module 3.
        m3.addStudent(s1);
        m3.addStudent(s2);
        m3.addStudent(s5);
        m3.addStudent(s6);
        
        //Setup Course 1.
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);
        
        c1.addModule(m1);
        c1.addModule(m2);
        
        //Set Up Course 2.
        c2.addStudent(s5);
        c2.addStudent(s6);
        
        c2.addModule(m3);
        
        ///////////////////////////////////////////////////////////Print Out Values./////////////////////////////////////////////////////////////
        
        System.out.println("/////////////////////////////////////////Course Info////////////////////////////////////////////////////");
        c1.print();
        System.out.println("\n");
        
        c2.print();
        
        System.out.println("\n/////////////////////////////////////////Student Info///////////////////////////////////////////////////");
        for(Student s: stud)
        {
            s.print();
            System.out.println("\n");
        }
    }
}