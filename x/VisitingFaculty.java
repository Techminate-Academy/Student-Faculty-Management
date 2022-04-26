import static java.lang.constant.ConstantDescs.NULL;

import java.util.Arrays;
public class VisitingFaculty extends Faculty {
    private double BASIC_SALARY=4000;
    private Course[] course;
    private int numberOfCourses=0;

    public VisitingFaculty(){}

    
    public VisitingFaculty(String name, int age, String address, double BASIC_SALARY, Course[] courses, int numberOfCourses) {
        super(name, age, address);
        this.BASIC_SALARY = BASIC_SALARY;
        this.course = courses;
        this.numberOfCourses = numberOfCourses;
    }

    public void addCourse(Course newcourse){
    	
    	if(newcourse!= NULL) {
            course[numberOfCourses] = newcourse;
            numberOfCourses++;
            
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
    }

    public double getSalary(){
    	
    	return BASIC_SALARY + BASIC_SALARY * numberOfCourses;	
    }

    @Override
	public String toString() {
		return "VisitingFaculty [BASIC_SALARY=" + BASIC_SALARY + ", course=" + Arrays.toString(course)
				+ ", numberOfCourses=" + numberOfCourses + ", getNumberOfCourses()=" + getNumberOfCourses()
				+ ", getSalary()=" + getSalary() + ", tostring()=" + toString() + ", toString()=" + super.toString()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}





}
