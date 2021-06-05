package contactentrysystem.demo.contacts.repository;

import contactentrysystem.demo.contacts.model.Phone;
import contactentrysystem.demo.contacts.model.Type;

import java.util.List;

public interface PhoneRepository {

    Phone create(Phone phone);
    Phone get(Long id);
    Phone update(Long id, Phone phone);
    Phone delete(Long id);
    void deleteByContactId(Long contact_id);
//    List<Phone> findAllByType(Type type);

}
