package exercise.exercise1;

public class Worker extends Person {
    private double salary;
    private String position;

    public Worker(double salary, String position) {
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Worker(int age, String name, double salary, String position) {
        super(age, name);
        this.salary = salary;
        this.position = position;
    }
}
