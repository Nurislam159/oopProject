import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean isworking = scanner.nextBoolean();
        String name = scanner.nextLine();

        Human human = new Human(age , name , isworking);
        Student student = new Student(18 , "Max" , false , "Astana IT" , 3.73f);
        Employee emp = new Employee(24, "Alex" , true , "Programming" , 500000);

        emp.setSalary(550000);
        System.out.println("GPA: " + student.getGpa());

        human.info();
        student.info();
        emp.info();
        emp.status();

        scanner.close();
    }
}
