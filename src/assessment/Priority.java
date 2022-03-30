package assessment;

import java.util.*;

public class Priority {
    PriorityQueue<Student> queue = new PriorityQueue<>(
        Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getId));

  public List<Student> getStudents(List<String> events) {
      Student student = null;
      for (String event : events) {
          if (event.equals("SERVED")) {
              queue.poll();
          } else if (event.equals("ENTER")) {
              String[] store = event.split(" ");
             student = new Student(Integer.parseInt(store[3]), store[1], Double.parseDouble(store[2]));
              queue.add(student);
              while (!queue.isEmpty()) {
                  queue.poll();
              }
          }

      }
      return queue.stream().toList();
}
}
