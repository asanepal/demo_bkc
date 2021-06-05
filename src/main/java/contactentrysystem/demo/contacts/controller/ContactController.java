package contactentrysystem.demo.contacts.controller;

import contactentrysystem.demo.contacts.model.Contact;
import contactentrysystem.demo.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ContactController {

    @Autowired
    private ContactService contactService;


    public ContactController() {}

    @RequestMapping(value = "/contacts",method = RequestMethod.POST)
    public String createContact(@RequestBody Contact contact) {

        contactService.createContact(contact);
        return "Contact Created succesfully";
    }

    @RequestMapping(value = "/contacts/{id}",method = RequestMethod.DELETE)
    public String deleteContact(@PathVariable("id") Long id) {
        contactService.deleteContactById(id);
        return "Contact Deleted Successfully";
    }

    @RequestMapping(value = "/contacts/{id}",method = RequestMethod.PUT)
    public String updateContact(@PathVariable("id") Long id,@RequestBody Contact contact) {
        contactService.updateContactById(id, contact);
        return "Contact Updated Successfully";
    }

    @RequestMapping(value = "/contacts/{id}",method = RequestMethod.GET)
    public Contact getContact(@PathVariable("id") Long id) {
        return contactService.getContactById(id);

    }

    @RequestMapping(value = "/contacts",method = RequestMethod.GET)
    public List<Contact> getAllContacts() {

        return contactService.getContacts();
    }



}
