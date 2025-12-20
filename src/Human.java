public class Human {
    private int age;
    private String name;
    private boolean isworking;
    public Human(int age, String name, boolean isworking) {
        this.age = age;
        this.name = name;
        this.isworking = isworking;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getIsworking() {
        return isworking;
    }
    public void setIsworking(boolean isworking) {
        this.isworking = isworking;
    }
    public void info() {
        System.out.println("Name:" + name + ", Age: " + age);
    }

    public void status() {
        System.out.println("Is working: " + isworking);
    }
}