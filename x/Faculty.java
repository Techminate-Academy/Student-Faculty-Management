
	import java.util.Arrays;

	public abstract class Faculty extends Parson {
	    public Faculty() {}
	    Course[] course;
	    public Faculty(String name, int age, String address) {
	        super(name, age, address);
	    }
	    public abstract void addCourse(Course newCourse); 
	    
	    public abstract void printCourse();
	    public int getNumberOfCourses() {
	    	return 0;
	    }
	    public abstract double getSalary();
		@Override
		public String toString() {
			return "Faculty [course=" + Arrays.toString(course) + ", getNumberOfCourses()=" + getNumberOfCourses()
					+ ", getSalary()=" + getSalary() + ", getName()=" + getName() + ", getAge()=" + getAge()
					+ ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + "]";
		}
	    
	

}
