package reflace;

/**
 * Created by Stelawliet on 17/10/3.
 */
public class Student implements Person{
    public Student(String name, String mClass, int sId) {
        this.name = name;
        this.mClass = mClass;
        this.sId = sId;
    }
    public Student(){

    }

    private String name;
    private String mClass;
    private int sId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmClass() {
        return mClass;
    }

    public void setmClass(String mClass) {
        this.mClass = mClass;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mClass='" + mClass + '\'' +
                ", sId=" + sId +
                '}';
    }

    @Override
    public void show() {
        System.out.println(this.toString());
    }
}
