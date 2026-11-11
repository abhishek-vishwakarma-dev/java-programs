public class inhrt {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.name = "Abhishek";
        es.age = 20;
        es.markAttendance();
        es.attendLab();
        System.out.println(es.name + " , " + es.age);

        Student s1 = new Student();
        s1.markAttendance();
        // s1.attendLab(); (wrong)
    }

}
/*
 * parent (Superclass) --> child(subclass)
 */

class Student {
    String name;
    int age;

    public void markAttendance() {
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student {
    void attendLab() {
        System.out.println("Lab attended");
    }
}
