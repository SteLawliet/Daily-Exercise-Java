package TreeSet2;

/**
 * Created by Stelawliet on 17/9/17.
 */
public class mStudent implements Comparable<mStudent> {
    private String name;
    private String age;
    private String score;

    public mStudent(String name, String age, String score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public int compareTo(mStudent o) {
        return 0;
    }

}
