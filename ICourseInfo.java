
// This interface is used to define the methods that will be used in the CourseInfo class.
// HINT: I would not change anything in this file
package org.example;

public interface ICourseInfo {
    String getDepartmentCode();
    void setDepartmentCode(String departmentCode);
    String getDepartmentName();
    void setDepartmentName(String departmentName);
    String getCourseNumber();
    void setCourseNumber(String courseNumber);
    String getCourseName();
    void setCourseName(String courseName);
    int getYear();
    void setYear(int year);
    String getSemester();
    void setSemester(String semester);
    String getInstructor();
    void setInstructor(String instructor);
    String toString();
}
