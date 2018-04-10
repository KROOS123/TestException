package exercise.inputexercise;

import java.security.PrivateKey;

public class Student implements Comparable {



    @Override
    public int compareTo(Object o){
        if(o instanceof  Student){
            Student s1=(Student)o;
            return -(this.getScore()-s1.getScore());
        }
        return 0;
    }
   private  int score;
   private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Student)) {return false;}

        Student student = (Student) o;

        if (getScore() != student.getScore()) {return false;}
        return getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        int result = getScore();
        result = 31 * result + getName().hashCode();
        return result;
    }

    public Student() {
        super();
    }

    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
