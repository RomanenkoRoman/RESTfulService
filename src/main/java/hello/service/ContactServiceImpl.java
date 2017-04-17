package hello.service;

import hello.entity.Contact;
import hello.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> listAll() {
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }


    @Override
    public Contact saveOrUpdate(Contact contact) {
        contactRepository.save(contact);
        return contact;
    }


}
