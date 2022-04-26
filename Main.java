import java.util.Scanner;

import models.Course;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the course: ");
    String nameOfCourse = sc.nextLine();
    System.out.print("Enter the code of the course: ");
    String courseCode = sc.nextLine();
    Course obj = new Course(nameOfCourse, courseCode);
    System.out.println("Course is :" + obj.toString());
  }
}