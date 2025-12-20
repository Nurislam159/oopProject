public class Employee extends Human {

    private String job;
    private float salary;

    // static field
    public static String company = "MyCompany";

    // Constructor
    public Employee(int age, String name, boolean alive,
                    String job, float salary) {
        super(age, name, alive);
        this.job = job;
        this.salary = salary;
    }

    // Getters and setters
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Overridden method
    @Override
    public void info() {
        System.out.println("Employee: " + getName() + ", Job: " + job);
    }
}
