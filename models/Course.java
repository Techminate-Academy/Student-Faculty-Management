package models;

public class Course {
    private String nameOfCourse;
    private String courseCode;

    public Course() {
        
    }

    // Creating constructor
    public Course(String nameOfCourse, String courseCode) {
        this.nameOfCourse = nameOfCourse;
        this.courseCode = courseCode;
    }

    // Getter
    public String getNameOfCourse() {
        return this.nameOfCourse;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    // Setter
    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }


    @Override
    public String toString() {
        return "Course{" +
                "nameOfCourse='" + nameOfCourse + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}

