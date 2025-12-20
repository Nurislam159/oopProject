public class Human {
    private int age;
    private String name;
    private boolean alive;
    public Human(int age, String name, boolean alive) {
        this.age = age;
        this.name = name;
        this.alive = alive;
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
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public void info() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void status() {
        System.out.println("Alive: " + alive);
    }
}