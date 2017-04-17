package hello.controller;

import java.util.List;
import java.util.stream.Collectors;

import hello.entity.Contact;
import hello.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ContactController {

    private ContactService contactService;

    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }


    @RequestMapping("/hello/contacts")
    public List<Contact> getContacts(@RequestParam(value = "nameFilter") String nameFilter) {

        return contactService
                .listAll()
                .stream()
                .filter(s -> !s.getName().matches(nameFilter))
                .collect(Collectors.toList());
    }

    /**
     * Show list of all contacts from db
     */
    @RequestMapping("/hello/list")
    public List<Contact> listContacts() {
        return contactService.listAll();
    }

    @RequestMapping("/")
    public RedirectView startPage(){
        return new RedirectView("/hello/list", true);
    }
    /**
     * Create new contact
     */
    @RequestMapping(value = "/hello/new/{newContact}", method = {RequestMethod.GET, RequestMethod.POST})
    public RedirectView create(@PathVariable String newContact) {
        Contact contact = new Contact();
        contact.setName(newContact);
        contactService.saveOrUpdate(contact);
        return new RedirectView("/hello/list", true);
    }


}

