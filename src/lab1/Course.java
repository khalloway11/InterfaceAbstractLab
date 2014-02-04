/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Keiji
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private int section;
    private int numEnrolled;
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    public String getPrerequisites(){
        return this.prerequisites;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        if(section >= 1){
            this.section = section;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Error: section numbers must start from 1");
            System.exit(0);
        }
    }

    public int getNumEnrolled() {
        return numEnrolled;
    }

    public void setNumEnrolled(int numEnrolled) {
        if(numEnrolled > 0){
            this.numEnrolled = numEnrolled;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Error: class cannot be empty");
            System.exit(0);
        }
    }
    
    
}
