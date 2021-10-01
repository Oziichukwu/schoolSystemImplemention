package services;

import db.SchoolDb;
import exceptions.SchoolNotFoundException;
import models.School;

import java.util.List;

public class SchoolServiceImp implements  SchoolServices{

    private SchoolDb schoolDb;

    @Override
    public void add(School school) {
        schoolDb.add(school);
    }

    @Override
    public void delete(School school) {
            schoolDb.delete(school);
    }

    @Override
    public School update(long id) throws SchoolNotFoundException {

        School school = schoolDb.findById(id);

        if (school == null){
            throw new SchoolNotFoundException("School with this id is not found");
        }
        return null;
    }

    @Override
    public School findById(long id) {
        return null;
    }

    @Override
    public List<School> getAll() {
        return null;
    }
}
