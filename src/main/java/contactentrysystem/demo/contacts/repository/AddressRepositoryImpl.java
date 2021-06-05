//package contactentrysystem.demo.contacts.repository;
//
//import contactentrysystem.demo.contacts.model.Address;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class AddressRepositoryImpl implements AddressRepository{
//
//    @Autowired
//    private AddressJpaRepository addressJpaRepository;
//
//    @Override
//    public Address create(Address address) {
//        return addressJpaRepository.saveAndFlush(address);
//    }
//
//    @Override
//    public Address get(Long id) {
//        return null;
//    }
//
//    @Override
//    public Address update(Long id, Address address) {
//        return null;
//    }
//
//    @Override
//    public Address delete(Long id) {
//        return null;
//    }
//}
