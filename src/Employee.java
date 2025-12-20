public class Employee extends Human {
    private String job;
    private float salary;
    public static String company = "MyCompany";
    public Employee(int age, String name, boolean alive,
                    String job, float salary) {
        super(age, name, alive);
        this.job = job;
        this.salary = salary;
    }
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
    @Override
    public void info() {
        System.out.println("Employee: " + getName() + ", Job: " + job);
    }
}
