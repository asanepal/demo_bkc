package contactentrysystem.demo.contacts.repository;

import contactentrysystem.demo.contacts.model.Phone;
import contactentrysystem.demo.contacts.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PhoneRepositoryImpl implements PhoneRepository{

    @Autowired
    private PhoneJpaRepository phoneJpaRepository;

    @Override
    public Phone create(Phone phone) {
        return phoneJpaRepository.saveAndFlush(phone);
    }

    @Override
    public Phone get(Long id) {
        return null;
    }

    @Override
    public Phone update(Long id, Phone phone) {
        return null;
    }

    @Override
    public Phone delete(Long id) {
        return null;
    }

    public void deleteByContactId(Long contact_id) {
         phoneJpaRepository.deleteByContactId(contact_id);
    }

//    @Override
//    @Query(
//            value = "SELECT * FROM phone p WHERE u.type = 1 JOIN p.contact_id ",
//            nativeQuery = true)
//    public List<Phone> findAllByTypeNative(Type type) {
//        return phoneJpaRepository.findPhonesByType(type);
//    }
}
