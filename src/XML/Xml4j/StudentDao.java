package XML.Xml4j;

/**
 * Created by Stelawliet on 17/10/8.
 */
public interface StudentDao {

    void addStudent(Student student);
    void addStudent();
    boolean delStudent(String s);
    Student getStudent(String s);
    Student updateStudent(Student student);

}
