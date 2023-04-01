package com.java.querysubscriber.Repository;

import com.java.querysubscriber.Domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Person, String>
{

}
