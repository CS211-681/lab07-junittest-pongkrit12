package ku.cs.models;

import ku.cs.services.StudentHardCodeDatasource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private static StudentList studentList;

    @BeforeAll
    static void initial() {
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        studentList = datasource.readData();
    }

    @Test
    @DisplayName("test add myself")
    void testAddNewStudent() {
        studentList.addNewStudent("6710451062","pongkrit");
        assertEquals("6710451062", studentList.findStudentById("6710451062").getId());
        assertEquals("pongkrit", studentList.findStudentById("6710451062").getName());
    }

    @Test
    @DisplayName("test filter ir")
    void testFilterByName() {
        assertEquals(2, studentList.filterByName("ir").getStudents().size());
    }

    @Test
    @DisplayName("test find studentbyid")
    void testFindStudentById() {
        assertEquals("6710400001", studentList.findStudentById("6710400001").getId());
    }

    @Test
    @DisplayName("test give score")
    void testGiveScoreToId() {
        studentList.giveScoreToId("6710400001", 15);
        assertEquals(15, studentList.findStudentById("6710400001").getScore());
    }

    @Test
    @DisplayName("test view grade")
    void testViewGradeOfId() {
        assertEquals("F", studentList.findStudentById("6710400001").getGrade());
    }


    @Test
    @DisplayName("test get student")
    void testGetStudent() {
        assertEquals("6710400001", studentList.findStudentById("6710400001").getId());
        assertEquals("First", studentList.findStudentById("6710400001").getName());
    }
}