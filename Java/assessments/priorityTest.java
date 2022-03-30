package assessments;

import assessment.Priority;
import assessment.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class priorityTest {
   public  Priority priority;
    public Student student;
    @Before
    public void setUp(){
        priority =  new Priority();
        student = new Student();
    }

    @Test
    public void priorityQueueTest(){
        student.setId(1);
        student.setName("Joy");
        student.setCgpa(3.2);
        List<String>students = new ArrayList<>();
        students.add(String.valueOf(student));
       assertNotNull( priority.getStudents(students));
    }
    @Test
    public  void moreStudentCanBeEnter(){
        student.setId(1);
        student.setName("Joy");
        student.setCgpa(3.2);
        student.setId(2);
        student.setName("Sam");
        student.setCgpa(3.2);
        student.setId(3);
        student.setName("Ade");
        student.setCgpa(3.4);
        List<String>students = new ArrayList<>();
        students.add(String.valueOf(student));
        assertEquals(3,(students.size()),3);
    }

}
