package services;

import db.SchoolDb;
import models.School;
import models.SchoolType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolServiceImpTest {
    private SchoolDb schoolDb;
    private SchoolServices schoolServices;
    @BeforeEach
    void setUp() {
        schoolDb = new SchoolDb();
        schoolServices = new SchoolServiceImp(schoolDb);
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Add School")
    @Test
    void add() {
        School school1 = new School("KIM","new school", SchoolType.OTHERS);
        assertEquals(1,school1.getId());
        School school2 = new School("LAM","cooking school", SchoolType.ELEMENTARY);
        School school3 = new School("daniel","making school", SchoolType.ELEMENTARY);
        assertEquals(3, school3.getId());

        schoolServices.addAll(school1,school2,school3);
        assertEquals(3, schoolDb.getAll().size());

    }

    @Test
    void delete() {
        School school1 = new School("KIM","new school", SchoolType.OTHERS);
        assertEquals(1,school1.getId());
        School school2 = new School("LAM","cooking school", SchoolType.ELEMENTARY);
        School school3 = new School("daniel","making school", SchoolType.ELEMENTARY);
        assertEquals(3, school3.getId());



    }

    @Test
    void findById() {

    }

    @Test
    void getAll() {

    }
}