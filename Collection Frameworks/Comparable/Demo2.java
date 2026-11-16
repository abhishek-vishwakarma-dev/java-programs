import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("Abhishek", 90);
        Student s2 = new Student("Aditya", 80);

        TreeSet<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println(set.size());
    }
}

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        if (this.marks != other.marks) {
            return other.marks - this.marks;
        }
        return this.name.compareTo(other.name);
    }
}
