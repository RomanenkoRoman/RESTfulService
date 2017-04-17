package hello.service;

import hello.entity.Contact;

import java.util.List;

/**
 * Created by Роман on 17.04.2017.
 *
 */
public interface ContactService {

    List<Contact> listAll();

    Contact saveOrUpdate(Contact contact);
}
