package org.example;

public class CourseInfo implements ICourseInfo {
    // HINT: The class variables should be just fine as they are
    private String departmentCode;
    private String departmentName;
    private String courseNumber;
    private String courseName;
    private int year;
    private String semester;
    private String instructor;

    // getters and setters
    public String getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getCourseNumber() {
        return courseNumber;
    }
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
// add the rest of the getters and setters here

    // toString method is what will be called when you print an object(Class) in Java
    public String toString() {
        return "Course Information: \n"
                + "\tDepartment: " + departmentCode + " - " + departmentName + "\n"
                + "\tCourse: " + courseNumber + " - " + courseName + "\n"
                + "\tYear: " + year + "\n"
                + "\tSemester: " + semester + "\n"
                + "\tInstructor: " + instructor + "\n";
    }
    // Do not alter main method
    public static void main(String[] args) {
        CourseInfo course = new CourseInfo();
        course.setDepartmentCode("CSE");
        course.setDepartmentName("Computer Science and Engineering");
        course.setCourseNumber("220");
        course.setCourseName("Object Oriented Programming");
        course.setYear(2025);
        course.setSemester("Spring");
        course.setInstructor("Nathan Russell");
        System.out.println(course);
    }
}