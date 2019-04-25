package repository;

import entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

//    @PersistenceContext // daca folosin Bean in databaseConfig si @Autowired daca folosim fisier xml, dar nu neaparat
//    EntityManager entityManager;
//
//    public List<Person> getPeople() {
//        String query = "SELECT p FROM Person p"; // SELECT * FROM Person
//
//        List<Person> personList = entityManager.createQuery(query).getResultList();
//
//        return personList;
//    }
}
