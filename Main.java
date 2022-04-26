import java.util.Scanner;

import models.Course;
import models.Person;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the name of the course: ");
    // String nameOfCourse = sc.nextLine();
    // System.out.print("Enter the code of the course: ");
    // String courseCode = sc.nextLine();
    // Course obj = new Course(nameOfCourse, courseCode);
    // System.out.println("Course is :" + obj.toString());

    System.out.print("Enter the name of the person: ");
    String nameOfPerson = sc.nextLine();

    System.out.print("Enter the address of the person: ");
    String addressOfPerson = sc.nextLine();

    System.out.print("Enter the age of the person: ");
    int ageOfPerson = sc.nextInt();

    Person person1 = new Person(nameOfPerson, ageOfPerson, addressOfPerson);
    System.out.println("person is :" + person1.toString());
  }
}