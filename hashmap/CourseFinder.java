package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CourseFinder {
    public static Map<String, List<String>> findPairs(List<List<String>> enrollments) {
        Map<String, List<String>> coursePairs = new HashMap<>();

        // Build a map of student IDs and their corresponding courses
        Map<String, Set<String>> coursesByStudent = new HashMap<>();
        for (List<String> enrollment : enrollments) {
            String studentId = enrollment.get(0);
            String course = enrollment.get(1);

            Set<String> courses = coursesByStudent.getOrDefault(studentId, new HashSet<>());
            courses.add(course);
            coursesByStudent.put(studentId, courses);
        }

        // Find pairs of students and their shared courses
        List<String> studentIds = new ArrayList<>(coursesByStudent.keySet());
        for (int i = 0; i < studentIds.size(); i++) {
            String studentId1 = studentIds.get(i);
            Set<String> courses1 = coursesByStudent.get(studentId1);

            for (int j = i + 1; j < studentIds.size(); j++) {
                String studentId2 = studentIds.get(j);
                Set<String> courses2 = coursesByStudent.get(studentId2);

                List<String> sharedCourses = new ArrayList<>(courses1);
                sharedCourses.retainAll(courses2);

                if (!sharedCourses.isEmpty()) {
                    String pair = studentId1 + "," + studentId2;
                    coursePairs.put(pair, sharedCourses);
                }
            }
        }

        return coursePairs;
    }

    public static void main(String[] args) {
        List<List<String>> enrollments1 = Arrays.asList(
                Arrays.asList("58", "Linear Algebra"),
                Arrays.asList("94", "Art History"),
                Arrays.asList("94", "Operating Systems"),
                Arrays.asList("17", "Software Design"),
                Arrays.asList("58", "Mechanics"),
                Arrays.asList("58", "Economics"),
                Arrays.asList("17", "Linear Algebra"),
                Arrays.asList("17", "Political Science"),
                Arrays.asList("94", "Economics"),
                Arrays.asList("25", "Economics"),
                Arrays.asList("58", "Software Design")
        );

        Map<String, List<String>> pairs1 = findPairs(enrollments1);
        System.out.println(pairs1);

        List<List<String>> enrollments2 = Arrays.asList(
                Arrays.asList("0", "Advanced Mechanics"),
                Arrays.asList("0", "Art History"),
                Arrays.asList("1", "Course 1"),
                Arrays.asList("1", "Course 2"),
                Arrays.asList("2", "Computer Architecture"),
                Arrays.asList("3", "Course 1"),
                Arrays.asList("3", "Course 2"),
                Arrays.asList("4", "Algorithms")
        );

        Map<String, List<String>> pairs2 = findPairs(enrollments2);
        System.out.println(pairs2);

        List<List<String>> enrollments3 = Arrays.asList(
                Arrays.asList("23", "Software Design"),
                Arrays.asList("3", "Advanced Mechanics"),
                Arrays.asList("2", "Art History"),
                Arrays.asList("33", "Another")
        );

        Map<String, List<String>> pairs3 = findPairs(enrollments3);
        System.out.println(pairs3);
    }
}