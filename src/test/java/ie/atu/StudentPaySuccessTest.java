package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentPaySuccessTest {
private StudentPay myStudentPay;

    @BeforeEach
    void setUp() {
        myStudentPay = new StudentPay("2134096812AIBK", "1836273IL", "24416FSD466F", 300);
    }

    @Test
    void testIbanSuccess(){

    }

    @AfterEach
    void tearDown() {
    }
}