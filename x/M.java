
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter how many courses you want to enter: ");
			int length = sc.nextInt();
			sc.nextLine();
			Course[] courses = new Course[length+2];

			for(int i=0; i<length; i++){
			    System.out.print("Enter the name of the course: ");
			    String nameOfCourse = sc.nextLine();
			    System.out.print("Enter the code of the course: ");
			    String courseCode = sc.nextLine();
			    courses[i] = new Course(nameOfCourse, courseCode);
			}

			Student s1 = new Student("Mosharrar", 23, "uttara, Dhaka-1230", 3.1, "2021091642", courses, 5, length);
			s1.toString();
			s1.printCourses();

			Course[] extra = new Course[2];

			for(int i=0; i< extra.length; i++){
			    System.out.print("Enter the name of the course: ");
			    String nameOfCourse = sc.nextLine();
			    System.out.println("Enter the age:");
			    System.out.println("Enter address:");
			    System.out.println("Enter salary:");
			    System.out.print("Enter the code of the course: ");
			    String courseCode = sc.nextLine();
			    extra[i] = new Course(nameOfCourse, courseCode);
			    s1.addCourse(extra[i]);
			}


			System.out.println("");
			s1.toString();
			s1.printCourses();

			// Second Student

			Course[] courses2 = new Course[5];

			for(int i=0; i< courses2.length; i++){
			    System.out.print("Enter the name of the course: ");
			    String nameOfCourse = sc.nextLine();
			    System.out.print("Enter the code of the course: ");
			    String courseCode = sc.nextLine();
			    courses2[i] = new Course(nameOfCourse, courseCode);
			}

			Student s2 = new Student("Rahat", 24, "Dhanmondi, Dhaka-1207", 2.4, "2122080642",courses2, 5,length);
			s2.toString();

			Course[] PFCourses = new Course[4];

			for(int i=0; i< PFCourses.length; i++){
			    System.out.print("Enter the name of the course: ");
			    String nameOfCourse = sc.nextLine();
			    System.out.print("Enter the code of the course: ");
			    String courseCode = sc.nextLine();
			    PFCourses[i] = new Course(nameOfCourse, courseCode);
			}


			// Permanent Faculty

			ParmanentFaculty F1 = new ParmanentFaculty("Slash", 30, "Mirpur",9000, PFCourses, 4);
			F1.toString();

			Course[] PFExtraCourses = new Course[4];

			for(int i=0; i< PFExtraCourses.length; i++){
			    System.out.print("Enter the name of the course: ");
			    String nameOfCourse = sc.nextLine();
			    System.out.print("Enter the code of the course: ");
			    String courseCode = sc.nextLine();
			    PFExtraCourses[i] = new Course(nameOfCourse, courseCode);
			    F1.addCourse(PFExtraCourses[i]);
			}

			F1.toString();


			// Visitor Faculty

			Course[] VFCourses = new Course[3];
			for(int i=0; i< VFCourses.length; i++){
			    System.out.print("Enter the name of the course: ");
			    String nameOfCourse = sc.nextLine();
			    System.out.print("Enter the code of the course: ");
			    String courseCode = sc.nextLine();
			    VFCourses[i] = new Course(nameOfCourse, courseCode);
			}
			VisitingFaculty VF1 = new VisitingFaculty("ozzy", 28, "RA", 5000, VFCourses,3);

			VF1.toString();
		}

        // First Student

    }
}