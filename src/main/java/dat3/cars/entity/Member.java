package dat3.cars.entity;


import dat3.security.dto.UserWithRolesRequest;
import dat3.security.entity.Role;
import dat3.security.entity.UserWithRoles;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Member extends UserWithRoles {


private String firstName;
    private String lastName;
    private String street;
    private String city;
    private int zipcode;
    private Boolean approved;
    private int ranking;


    public Member(String user, String password, String email, String firstName) {
        super(user, password, email);
        this.firstName = firstName;
    }

    public Member (){};

    public Member(String firstName, String lastName, String street, String city, int zipcode, Boolean approved, int ranking) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.approved = approved;
        this.ranking = ranking;
    }
}
