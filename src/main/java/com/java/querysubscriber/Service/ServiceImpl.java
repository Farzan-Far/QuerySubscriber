package com.java.querysubscriber.Service;

import com.java.querysubscriber.DataModels.Request;
import com.java.querysubscriber.DataModels.Response;
import com.java.querysubscriber.Domain.Person;
import com.java.querysubscriber.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements UserService
{

    @Autowired
    Repo repository;


    @Override
    public Response createPerson(Request request)
    {
        Person person1= new Person();

        person1.setName(request.getName());
        person1.setFamily(request.getFamily());
        person1.setNationalID(request.getNationalID());
        person1.setCountry(request.getCountry());

        repository.save(person1);

        return new Response("New Person is Added.");
    }

    @Override
    public List<Person> getAllPerson()
    {
        return repository.findAll();
    }

    @Override
    public Optional<Person> findByNationalID(String id)
    {
        Person person = getAllPerson().stream().filter(t -> id.equals(t.getNationalID()))
                .findFirst()
                .orElse(null);
        return repository.findById(id);
    }
}
