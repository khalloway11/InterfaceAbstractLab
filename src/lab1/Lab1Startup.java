/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Keiji
 */
public class Lab1Startup {
    public static void main(String[] args){
        IntroToProgrammingCourse introProg = new IntroToProgrammingCourse("Introduction to Programming", "152-141");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java", "152-150");
        AdvancedJavaCourse advJava1 = new AdvancedJavaCourse("Advanced Java", "152-180");
        
        introJava.setNumEnrolled(12);
        introJava.setSection(1);
        introJava.setPrerequisites(introProg.getCourseName());
        System.out.println(introJava.getPrerequisites());
        
        Course c1 = new IntroToProgrammingCourse("Introduction to Programming", "152-141");
        /**
         * The danger about using the Liskov substitution method is that these objects
        cannot use anything implemented from the subclass. If the majority of the 
        implementation is present in the abstract class, and any methods or properties
        in the subclass are not needed in the operation of the program, there are
        no ill effects. However, if that is ever not the case, then this becomes 
        * detrimental to the operation of the program.
        */
    }
}
/**
 * The advantage of using an abstract class  as opposed to an interface is that
 * any common methods and properties can be implemented in the abstract class
 * and be inherited to all subclasses easily. It can also hold abstract methods
 * for implementing a common method that may require unique implementations within
 * the subclasses. 
 * 
 */