package example.repository;

import example.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Long> {

    Page<Person> findAll(Pageable pageable);
}