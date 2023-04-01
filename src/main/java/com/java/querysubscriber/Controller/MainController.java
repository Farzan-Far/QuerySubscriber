package com.java.querysubscriber.Controller;

import com.java.querysubscriber.DataModels.Request;
import com.java.querysubscriber.DataModels.Response;
import com.java.querysubscriber.Domain.Person;
import com.java.querysubscriber.Exception.InternalServerError;
import com.java.querysubscriber.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/person")
public class MainController
{
    @Autowired
    ServiceImpl service;

    @PostMapping("/add")
    public ResponseEntity<Response> create(@RequestBody Request request)
    {
        try {
            Response response = service.createPerson(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }  catch (Exception e)
        {
            throw new InternalServerError(e.getMessage());
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAll()
    {
        try {
          List<Person> persons = service.getAllPerson();
          return new ResponseEntity<>(persons,HttpStatus.OK);

        } catch (Exception e)
        {
            throw new InternalServerError(e.getMessage());
        }
    }

    @PostMapping("/find")
    public Optional<Person> findPerson(@RequestBody Request request)
    {
        try {
            return service.findByNationalID(request.getNationalID());
        }  catch (Exception e)
        {
            throw new InternalServerError(e.getMessage());
        }

    }

}
