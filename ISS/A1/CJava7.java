import java.util.*;

public class CJava7 {
    static Set<Student> studentSet = new HashSet<>();// Student set
    static List<Student> studentList = new ArrayList<>();// Students list
    static Map<Integer, Student> studentMap = new HashMap<>(); // Students Map

    public static void main(String[] args) {
        System.out.println("List");
        useList();
        System.out.println("Map");
        useMap();
        System.out.println("Set");
        useSet();
    }

    public static void useList() {
        // add students to the list
        studentList.add(new Student(1, "ABC"));
        studentList.add(new Student(2, "BCD"));
        studentList.add(new Student(3, "CDE"));
        studentList.add(new Student(4, "BCD"));
        studentList.add(new Student(5, "EFG"));

        // elements by index
        Student firstStudent = studentList.get(0);
        System.out.println("First Student - " + firstStudent.getName());

        // iterate over the list
        System.out.println("Student List - ");
        for (Student student : studentList) {
            System.out.println(student.getID() + " - " + student.getName());
        }

        // check if a student is in the list
        Student searchStudent = new Student(2, "BCD");
        boolean containsStudent = studentList.contains(searchStudent);
        System.out.println("Contains BCD? = " + containsStudent);

        // remove student from the list
        studentList.remove(searchStudent);
        System.out.println("Student List after removal:");
        for (Student student : studentList) {
            System.out.println(student.getID() + " - " + student.getName());
        }

        // check the size of the list
        int size = studentList.size();
        System.out.println("Size of Student List - " + size);

        // clearing the list
        studentList.clear();
        System.out.println("Student List after clearing:");
        for (Student student : studentList) {
            System.out.println(student.getID() + " - " + student.getName());
        }
        System.out.println();
    }

    public static void useSet() {
        // add students to the set
        studentSet.add(new Student(1, "ABC"));
        studentSet.add(new Student(2, "BCD"));
        studentSet.add(new Student(3, "CDE"));
        studentSet.add(new Student(4, "BCD"));
        studentSet.add(new Student(5, "EFG"));
        // elements by index
        int size = studentSet.size();
        System.out.println("Size of Student Set - " + size);

        // iterate over the set
        System.out.println("Student Set -");
        for (Student student : studentSet) {
            System.out.println(student.getID() + " - " + student.getName());
        }

        // check if a student is in the set
        Student searchStudent = new Student(5, "EFG");
        boolean containsStudent = studentSet.contains(searchStudent);
        System.out.println("Contains EFG? = " + containsStudent);

       // remove student from the set
        studentSet.remove(searchStudent);
        System.out.println("Student Set after removal ");
        for (Student student : studentSet) {
            System.out.println(student.getID() + " - " + student.getName());
        }

        // clearing the set
        studentSet.clear();
        System.out.println("Student Set after clearing:");
        for (Student student : studentSet) {
            System.out.println(student.getID() + " - " + student.getName());
        }
        System.out.println();
    }

    public static void useMap() {
        // add students to the  map
        studentMap.put(1, new Student(1, "ABC"));
        studentMap.put(2, new Student(2, "BCD"));
        studentMap.put(3, new Student(3, "CDE"));

        // elements by  ID
        int ID = 2;
        Student student = studentMap.get(ID);
        if (student != null) {
            System.out.println("Student with ID " + ID + " - " + student.getName());
        } else {
            System.out.println("Student not found with ID " + ID);
        }

        //iterate over the map entries
        System.out.println("Student Map -");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            int key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " - " + value.getName());
        }

        // check if a student is in the map
        Student searchStudent = new Student(3, "CDE");
        boolean containsStudent = studentMap.containsValue(searchStudent);
        System.out.println("Contains CDE? = " + containsStudent);

        // remove student from the map
        studentMap.remove(2);
        System.out.println("Student Map after removal - ");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            int key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " - " + value.getName());
        }

        // check map size
        int size = studentMap.size();
        System.out.println("Size of Student Map - " + size);

        studentMap.clear();// clearing the map
        System.out.println("Student Map after clearing:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            int key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " - " + value.getName());
        }
        System.out.println();
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }
}