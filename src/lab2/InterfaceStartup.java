/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Keiji
 */
public class InterfaceStartup {
    public static void main(String[] args){
        IntroToProgrammingCourse introProg = new IntroToProgrammingCourse("Introduction to Programming", "152-141");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java", "152-150");
        AdvancedJavaCourse advJava1 = new AdvancedJavaCourse("Advanced Java", "152-180");
        
        introJava.setStudentsEnrolled(12);
        introJava.setSectionNum(1);
        introJava.setPrerequisites(introProg.getCourseName());
        System.out.println(introJava.getPrerequisites());
        
        //Course c1 = new IntroToProgrammingCourse("Introduction to Programming", "152-141");
        /**
         * Liskov substitution cannot be used with an interface, only with concrete or
         * abstract classes
        */
    }
}
/**
 * The advantage of using an interface over an abstract class is that the interface
 * can be used as part of multiple different interfaces, which is the only way
 * multiple inheritance is allowed in java. It also enforces program structure by forcing
 * adherence to the interface in the classes' implementations.
 */