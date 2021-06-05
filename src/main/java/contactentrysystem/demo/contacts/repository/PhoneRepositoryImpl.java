//package contactentrysystem.demo.contacts.repository;
//
//import contactentrysystem.demo.contacts.model.Phone;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class PhoneRepositoryImpl implements PhoneRepository{
//
//    @Autowired
//    private PhoneJpaRepository phoneJpaRepository;
//
//    @Override
//    public Phone create(Phone phone) {
//        return phoneJpaRepository.saveAndFlush(phone);
//    }
//
//    @Override
//    public Phone get(Long id) {
//        return null;
//    }
//
//    @Override
//    public Phone update(Long id, Phone phone) {
//        return null;
//    }
//
//    @Override
//    public Phone delete(Long id) {
//        return null;
//    }
//}
