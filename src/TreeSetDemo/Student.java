package TreeSetDemo;

/**
 * Created by Stelawliet on 17/9/16.
 */
public class Student implements Comparable<Student>{
    private String name;
    private int Chinese;
    private int Math;
    private int English;
    private int score;

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
        this.score =Chinese+this.English+this.Math;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + getScore() +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        int i = this.score -s.score;
        return 0;
    }
}