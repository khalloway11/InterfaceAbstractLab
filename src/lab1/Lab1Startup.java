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
    }
}
