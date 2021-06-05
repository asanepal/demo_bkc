package contactentrysystem.demo.contacts.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Embeddable
public class Name {

    private String first;
    private String middle;
    private String last;
}
