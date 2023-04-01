package com.java.querysubscriber.Service;

import com.java.querysubscriber.DataModels.Request;
import com.java.querysubscriber.DataModels.Response;
import com.java.querysubscriber.Domain.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService
{
    Response createPerson(Request request);

    List<Person> getAllPerson();

    Optional<Person> findByNationalID(String id);
}
