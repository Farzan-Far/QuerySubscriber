package com.java.querysubscriber.Service;

import com.java.querysubscriber.DataModels.Request;
import com.java.querysubscriber.DataModels.Response;
import com.java.querysubscriber.Domain.Person;
import com.java.querysubscriber.Exception.ResourceNotFoundException;
import com.java.querysubscriber.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements UserService
{
    private final Repo repository;
    @Autowired
    public ServiceImpl(Repo repository)
    {
        this.repository = repository;
    }

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
        return repository.findById(id);
    }

    @Override
    public Response deletePerson(String id)
            throws ResourceNotFoundException
    {
        if (repository.getById(id).getNationalID().equals(id))
        {
            repository.deleteById(id);
        }
        else throw new ResourceNotFoundException("Employee", "id", id);
        return new Response("The Record has been deleted");
    }

    public Response updatePerson(Request request)
            throws Exception {
        Optional<Person> person = repository.findById(request.getNationalID());
        if(person.isPresent())
        {
            Person person1 = person.get();
            person1.setName(request.getName());
            person1.setFamily(request.getFamily());
            person1.setNationalID(request.getNationalID());
            person1.setCountry(request.getCountry());

            repository.save(person1);
        }
        else throw new Exception();

        return new Response("The Recorde has been Updated.");
        }
    }
