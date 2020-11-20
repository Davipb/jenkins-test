package com.davipb.jenkinstest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test 
    void twoPlusTwo_equalsFour() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test 
    void onePlusThree_equalsFour() {
        assertEquals(4, Calculator.add(1, 3));
    }
}
