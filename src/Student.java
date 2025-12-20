public class Student extends Human {
    private String university;
    private float gpa;
    public Student(int age, String name, boolean isworking, String university, float gpa) {
        super(age, name, isworking);
        this.university = university;
        this.gpa = gpa;
    }
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
    @Override
    public void info() {
        System.out.println("Student: " + getName() + ", University: " + university);
    }
}
