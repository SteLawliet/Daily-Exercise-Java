package XML.Xml4j;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Stelawliet on 17/10/8.
 */
public class Student {
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    private String id;
    private String name;
    private String sex;
}
