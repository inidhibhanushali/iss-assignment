import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}

public class CJava75 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "ABC"));
        studentList.add(new Student(4, "BCD"));
        studentList.add(new Student(3, "CDE"));
        studentList.add(new Student(2, "BCD"));
        studentList.add(new Student(5, "EFG"));
        System.out.println("Before Sorting\n");
        for (Student student : studentList) {
            System.out.println(student.getID() + " - " + student.getName());
        }

        // Sorting using Comparable by id
        Collections.sort(studentList);

        System.out.println("After Sorting (by ID)\n");
        for (Student student : studentList) {
            System.out.println(student.getID() + " - " + student.getName());
        }

        // Sorting using Comparator (by name)
        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        };
        Collections.sort(studentList, nameComparator);

        System.out.println("After Sorting (by Name):");
        for (Student student : studentList) {
            System.out.println(student.getID() + " - " + student.getName());
        }
    }
}