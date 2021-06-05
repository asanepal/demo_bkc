package contactentrysystem.demo.contacts.repository;

import contactentrysystem.demo.contacts.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactRepositoryImpl implements ContactRepository {

    @Autowired
    private ContactJpaRepository contactJpaRepository;
    @Override
    public Contact create(Contact contact) {
        Contact savedContact = contactJpaRepository.save(contact);
        return savedContact;

    }

    @Override
    public Contact get(Long id) {
        return contactJpaRepository.findById(id).get();
    }

    @Override
    public void update(Long id, Contact contact) {
        Contact savedContact = contactJpaRepository.findById(id).get();
        contact.setId(savedContact.getId());
        contactJpaRepository.save(contact);
    }

    @Override
    public void delete(Long id) {
        contactJpaRepository.deleteById(id);
    }

    @Override
    public List<Contact> getAll() {
        return contactJpaRepository.findAll();
    }
}
