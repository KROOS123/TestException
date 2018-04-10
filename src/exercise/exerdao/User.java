package exercise.exerdao;

public class User {
    public static  final  int A=0;
    private  int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof User)) {return false;}

        User user = (User) o;

        if (getId() != user.getId()) {return false;}
        if (getAge() != user.getAge()) {return false;}
        return getName().equals(user.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getAge();
        result = 31 * result + getName().hashCode();
        return result;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
