import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Alive (true/false): ");
        boolean alive = sc.nextBoolean();
        Employee emp = new Employee(age, name, alive, "Developer", 1000f);
        Human human = new Human(30, "Alex", true);
        Student student = new Student(18, "Anna", true, "AITU", 3.5f);
        emp.setSalary(1200f);
        student.setGpa(3.8f);
        System.out.println(emp.getSalary());
        System.out.println(student.getGpa());
        human.info();
        student.info();
        emp.info();
        emp.status();
        System.out.println("Company: " + Employee.company);
        sc.close();
    }
}
