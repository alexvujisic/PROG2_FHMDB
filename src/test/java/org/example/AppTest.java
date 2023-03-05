package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void teste_add(){
        assertEquals(2, App.add(1));
    }
}