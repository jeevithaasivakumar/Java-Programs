import java.util.ArrayList;
import java.util.*;

class Student {
    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno=rollno;
    }

    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public student(int rollno, String name){
        super();
        this.rollno = rollno;
        this.name =name;
    }
}

public class ArrayListKModel {
    public static void main(String[] args) {
        // student s1 = new student();
        ArrayList<student> stu = new ArrayList<>();
        stu.add(new student(101, "jee"));
        stu.add(new student(102, "vithaa"));
        System.out.println(stu.get(0).getName());

    
    }

}
