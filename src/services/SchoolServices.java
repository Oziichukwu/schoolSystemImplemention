package services;

import exceptions.SchoolNotFoundException;
import models.School;

import java.util.List;

public interface SchoolServices {

    void add(School school);
    void delete(School school);
    School update(long id) throws SchoolNotFoundException;
    School findById(long id);
    List<School> getAll();
}
