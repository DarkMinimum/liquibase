package ua.darkminimum.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.darkminimum.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}