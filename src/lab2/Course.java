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
public interface Course {
    
    //setters
    public void setCourseName(String courseName);
    public void setCourseNumber(String courseNumber);
    public void setCredits(double credits);
    public void setPrerequisites(String prerequisites);
    public void setSectionNum(int sectionNum);
    public void setStudentsEnrolled(int enrolled);
    
    //getters
    public String getCourseName();
    public String getCourseNumber();
    public double getCredits();
    public String getPrerequisites();
    public int getSectionNum();
    public int getStudentsEnrolled();
}
