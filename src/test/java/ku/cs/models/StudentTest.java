package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeAll
    static void initial(){
        s = new Student("67xxxxxxxx","test");
    }

    @Test
    @DisplayName("test add Score 45.15")
    void testAddScore(){
        Student s = new Student("67xxxxxxxx","Test");
        s.addScore(45.15);
        assertEquals(45.15,s.getScore());
    }

    @Test
    @DisplayName("test Grade A")
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("change name to cartoon")
    void testChangeName(){
        Student s = new Student("67xxxxxxxx","StudentTest");
        s.changeName("cartoon");
        assertEquals("cartoon", s.getName());
    }

    @Test
    @DisplayName("test isID")
    void testIsId(){
        Student s = new Student("67xxxxxxxx","StudentTest");
        assertTrue(s.isId("67xxxxxxxx"));
    }

    @Test
    @DisplayName("Test nameContains")
    void testNameContains(){
        Student s = new Student("67xxxxxxxx","StudentTest");
        assertTrue(s.isNameContains("StudentTest"));
    }
}