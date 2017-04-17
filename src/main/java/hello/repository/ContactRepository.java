package hello.repository;

import hello.entity.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Роман on 17.04.2017.
 *
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
