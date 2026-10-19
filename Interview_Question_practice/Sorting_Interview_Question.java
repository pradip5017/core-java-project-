package Interview_Question_practice;

import java.util.*;

class Student {
    int rollNumber;
    int rank;
    String name;

    Student(int rollNumber, int rank, String name) {
        this.rollNumber = rollNumber;
        this.rank = rank;
        this.name = name;
    }

    public String toString() {
        return rollNumber + " " + rank + " " + name;
    }
}

public class Sorting_Interview_Question {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(2, 3, "Sumit"));
        students.add(new Student(1, 4, "Shweta"));
        students.add(new Student(3, 3, "Sakshi"));

        Collections.sort(students, (s1, s2) -> {
            if (s1.rank != s2.rank)
                return s1.rank - s2.rank;  // sort by rank
            else
                return s1.name.compareTo(s2.name); // sort by name if rank same
        });

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
