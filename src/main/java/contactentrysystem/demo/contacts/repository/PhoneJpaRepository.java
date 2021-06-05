package contactentrysystem.demo.contacts.repository;

import contactentrysystem.demo.contacts.model.Phone;
import contactentrysystem.demo.contacts.model.Type;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PhoneJpaRepository extends JpaRepository<Phone,Long> {
    Integer deleteByContactId(Long contactId);
    List<Phone> findPhoneByType(Type type);
    List<Phone> findPhonesByType(Type type);
}
