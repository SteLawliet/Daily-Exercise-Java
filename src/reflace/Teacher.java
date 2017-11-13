package reflace;

import java.util.Objects;

/**
 * Created by Stelawliet on 17/10/3.
 */
public class Teacher implements Person{
    private String name;

    private String Obj;

    private int age;

    public Teacher(){

    }

    public Teacher(String name, String obj, int age) {
        this.name = name;
        Obj = obj;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObj() {
        return Obj;
    }

    public void setObj(String obj) {
        Obj = obj;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age &&
                Objects.equals(name, teacher.name) &&
                Objects.equals(Obj, teacher.Obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Obj, age);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", Obj='" + Obj + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void show() {
            System.out.println(this.toString());
        }
    }

