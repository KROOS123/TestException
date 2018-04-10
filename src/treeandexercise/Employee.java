package treeandexercise;
/*
该类包含：private成员变量name,age,birthday，其中 birthday 为 MyDate 类的对象；
并为每一个属性定义 getter, setter 方法；
并重写 toString 方法输出 name, age, birthday
 */

import org.junit.Test;

import java.util.Date;
import java.util.TreeSet;

public  class Employee implements Comparable {
    private int age;
    private String name;
    private  MyDate birthday;
    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Object o){
        if(o  instanceof  Employee){
            return this.getName().compareTo(((Employee) o).getName());
        }
        return 0;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Employee)) {return false;}

        Employee employee = (Employee) o;

        if (getAge() != employee.getAge()) {return false;}
        if (!getName().equals(employee.getName())) {return false;}
        return getBirthday().equals(employee.getBirthday());
    }

    @Override
    public int hashCode() {
        int result = getAge();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getBirthday().hashCode();
        return result;
    }

    public Employee(String name, int age, MyDate birthday) {

        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }




}
