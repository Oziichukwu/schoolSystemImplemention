package services;

import db.SchoolDb;
import exceptions.SchoolNotFoundException;
import models.School;

import java.util.List;

public class SchoolServiceImp implements  SchoolServices{

    private final SchoolDb schoolDb;

    public SchoolServiceImp(SchoolDb schoolDb) {
        this.schoolDb = schoolDb;
    }

    @Override
    public void add(School school) {
        schoolDb.add(school);
    }

    @Override
    public void delete(School school) {
            schoolDb.delete(school);
    }

    @Override
    public School update(long id, School school) throws SchoolNotFoundException {

        School foundSchool = findById(id);

        return school;
    }

    @Override
    public School findById(long id) throws SchoolNotFoundException {

        School foundSchool = schoolDb.findById(id);

        if (foundSchool == null){
            throw new SchoolNotFoundException("School with this id is not found");
        }
        return foundSchool;
    }

    @Override
    public List<School> getAll() {
        return schoolDb.getAll();
    }

    @Override
    public void addAll(School... schools) {
        for (School school : schools){
            schoolDb.add(school);
        }
    }
}
