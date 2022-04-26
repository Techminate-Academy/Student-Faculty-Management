import java.util.Arrays;

import static java.lang.constant.ConstantDescs.NULL;

public class Student extends Person {
    private double cgpa;
    private String id;
    Course []courses;
    private int numberOfCourses;

    public Student(){
        //
    }
    //Constructor
    public Student(String name, int age, String address, double cgpa, String id, Course[] courses, int numberOfCourse) {
        super(name, age, address);
        this.cgpa = cgpa;
        this.id = id;
        this.courses = courses;
        this.numberOfCourses = numberOfCourse;
    }

    //Getter
    public double getCgpa() {
        return this.cgpa;
    }

    public String getId() {
        return this.id;
    }

    public Course[] getCourses() {
        return this.courses;
    }

    public int getNumberOfCourses() {
        return this.numberOfCourses;
    }

    //Setter
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    //others
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
