package com.shubhaga.designpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    public void testBuilder() {
        // Arrange
        int age = 18;
        String pass = "abc";
        String email = "shubhaga@xyz.com";
        String name = "Shubham";

        // Act
        Student student = Student.getBuilder()
                .setAge(age)
                .setPass(pass)
                .setEmail(email)
                .setName(name)
                .build();

        // Assert
        assertEquals(age, student.getAge());
        assertEquals(pass, student.getPass());
        assertEquals(email, student.getEmail());
        assertEquals(name, student.getName());
    }
}