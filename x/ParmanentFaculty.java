
import static java.lang.constant.ConstantDescs.NULL;

import java.util.Arrays;
public class ParmanentFaculty extends Faculty {
    private double BASIC_SALARY=5000;
    private Course[] course;
    private int numberOfCourses=0;


    public ParmanentFaculty(String name, int age, String address, double BASIC_SALARY, Course[] course, int numberOfCourse) {
        super(name, age, address);
        this.BASIC_SALARY = BASIC_SALARY;
        this.course = course;
        this.numberOfCourses = numberOfCourse;
    }

    public void addCourse(Course newcourse){
    	
   
        if(newcourse!= NULL) {
            course[numberOfCourses++] = newcourse;
            
        }
        else{
            System.out.println("you cannot take anymore course");
        }
    	
    }

    public void printCourse(){
    	
    	for(int i=0;i<course.length;i++){
            System.out.println(course[i]);
        }
    	
    	
    	
    }

    public int getNumberOfCourses(){
        return numberOfCourses;
    };

    public double getSalary(){
    	
    	return BASIC_SALARY + numberOfCourses*BASIC_SALARY;
    	
    }

	@Override
	public String toString() {
		return "ParmanentFaculty [BASIC_SALARY=" + BASIC_SALARY + ", courses=" + Arrays.toString(course)
				+ ", numberOfCourses=" + numberOfCourses + ", course=" + Arrays.toString(course)
				+ ", getNumberOfCourses()=" + getNumberOfCourses() + ", getSalary()=" + getSalary() + ", toString()="
				+ super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getAddress()="
				+ getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

    





}
