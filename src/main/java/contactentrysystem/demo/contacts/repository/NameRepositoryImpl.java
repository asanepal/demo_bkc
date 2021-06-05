//package contactentrysystem.demo.contacts.repository;
//
//import contactentrysystem.demo.contacts.model.Name;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class NameRepositoryImpl implements NameRepository{
//
//    @Autowired
//    private NameJpaRepository nameJpaRepository;
//
//    @Override
//    public Name create(Name name) {
//        return nameJpaRepository.saveAndFlush(name);
//    }
//
//    @Override
//    public Name get(Long id) {
//        return null;
//    }
//
//    @Override
//    public Name update(Long id, Name name) {
//        return null;
//    }
//
//    @Override
//    public Name delete(Long id) {
//        return null;
//    }
//}
