package contactentrysystem.demo.contacts.service;

import contactentrysystem.demo.contacts.model.Phone;
import contactentrysystem.demo.contacts.model.Type;
import contactentrysystem.demo.contacts.repository.PhoneRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService{
    @Autowired
    private PhoneRepositoryImpl phoneRepositoryImpl;
//    @Override
//    public List<Phone> getCallList() {
//        return phoneRepositoryImpl.findAllByType(Type.home);
//    }
}
