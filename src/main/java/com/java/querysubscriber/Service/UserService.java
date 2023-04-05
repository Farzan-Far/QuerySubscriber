package com.java.querysubscriber.Service;

import com.java.querysubscriber.DataModels.Request;
import com.java.querysubscriber.DataModels.Response;
import com.java.querysubscriber.Domain.Person;
import com.java.querysubscriber.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService
{
    Response createPerson(Request request);

    List<Person> getAllPerson();

    Optional<Person> findByNationalID(String id);

    Response deletePerson(String id) throws ResourceNotFoundException;

    Response updatePerson(Request request) throws ResourceNotFoundException, Exception;
}
