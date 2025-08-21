package ku.cs.models;

import ku.cs.services.StudentHardCodeDatasource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private static StudentList studentList;

    @BeforeAll
    static void initial(){
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        studentList = datasource.readData();
    }
    @Test
    void testFindStudentById(){
        Student target = new Student("6710400001", "First");
        assertEquals(target,studentList.findStudentById("6710400001"));
    }

    @Test
    void testGiveScoreToId(){
        studentList.giveScoreToId("6710400001",15);
        assertEquals(15,studentList.findStudentById("6710400001").getScore());
    }
}