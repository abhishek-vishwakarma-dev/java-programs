public class Demo2 {
    public static void main(String[] args) {
        Student s = new Student("Abhishek", 240, 20, "LNCTS");
        System.out.println(s.name);
        System.out.println(s.college);

        System.out.println(s.getrollNumber());
        System.out.println(s.getage());

    }

}

class Student {
    public String name;
    public String college;
    private int rollNumber;
    private int age;

    Student(String name, int rollNumber, int age, String college) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.college = college;
    }

    // getters / setters
    public int getrollNumber() {
        return rollNumber;
    }

    public int getage() {
        return age;
    }

    public void setCollege(String college) {
        // Validations --> college should be real.
        this.college = college;
    }

}
