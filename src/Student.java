public class Student extends Human {

    private String university;
    private float gpa;

    // Constructor
    public Student(int age, String name, boolean alive,
                   String university, float gpa) {
        super(age, name, alive);
        this.university = university;
        this.gpa = gpa;
    }

    // Getters and setters
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    // Overridden method
    @Override
    public void info() {
        System.out.println("Student: " + getName() + ", University: " + university);
    }
}
