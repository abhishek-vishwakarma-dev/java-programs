import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Abhishek", 90));
        list.add(new Student("Adita", 70));
        list.add(new Student("Abahy", 80));
        list.add(new Student("Rohit", 50));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.name + " , " + s.marks);
        }
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

// this.marks - other.marks;
// < 0 : this.marks, other.marks
// > 0 : other.marks, this.marks
