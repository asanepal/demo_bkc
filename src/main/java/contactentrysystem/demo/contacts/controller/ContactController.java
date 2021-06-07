package contactentrysystem.demo.contacts.controller;

import contactentrysystem.demo.contacts.model.*;
import contactentrysystem.demo.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("")
public class ContactController {

    @Autowired
    private ContactService contactService;


    public ContactController() {}

    @RequestMapping(value = "/contacts",method = RequestMethod.POST)
    public String createContact(@RequestBody Contact contact) {

        contact.getPhone().forEach(phone -> {phone.setContact(contact);});
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
        contact.getPhone().forEach(phone -> {phone.setContact(contact);});
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

    @RequestMapping(value = "/contacts/call-list",method = RequestMethod.GET)
    public List<callList> getCallList() {

        List<Contact> response = contactService.getCallList();
        List<callList> final_response = new ArrayList<>();
        for (Contact contact : response) {
                 Name name = Name.builder().first(contact.getName().getFirst()).middle(contact.getName().getMiddle()).last(contact.getName().getLast()).build();
                 for (Phone p: contact.getPhone()){
                     if (p.getType() == Type.home) {
                         callList calllist = callList.builder().name(name).Number(p.getNumber()).build();
                         final_response.add(calllist);
                     }
             }


        }
        return final_response;
    }



}
