import java.util.Arrays;

import static java.lang.constant.ConstantDescs.NULL;
package models;

public class Student extends Parson {
    private double cgpa;
    private String id;
    Course []courses;
    private int numberOfCourses;
    public Student(){}

    public Student(double cgpa, String id) {
        this.cgpa = cgpa;
        this.id = id;
    }

    public Student(String name, int age, String address, double cgpa, String id, Course[] courses, int numberOfCurse) {
        super(name, age, address);
        this.cgpa = cgpa;
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }
    public void addCourse(Course newcourse){
        int j=0;
        if(newcourse!=NULL) {
            courses[j] = newcourse;
            j++;
        }
        else{
            System.out.println("you cannot take anymore course");
        }
    }

    public void printCourses(){
        for(int i=0;i<courses.length;i++){
            System.out.println(courses[i]);
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "cgpa=" + cgpa +
                ", id='" + id + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", numberOfCourse=" + numberOfCourses+
                '}';
    }
}
