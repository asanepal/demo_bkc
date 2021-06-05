//package contactentrysystem.demo.contacts.model;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Setter
//@Getter
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name="phone")
//public class Phone implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "contact_id",referencedColumnName="id")
//    private Contact contact;
//    private String number;
//    private Type type;
//}

package contactentrysystem.demo.contacts.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Embeddable
public class Phone {
    private String type;
    private String number;
}

