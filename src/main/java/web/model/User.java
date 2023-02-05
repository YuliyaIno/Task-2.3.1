package web.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    @Size(min = 2, max = 35, message = "FIRSTNAME field: must be between 2 and 35 characters")
    @NotBlank(message = "FIRSTNAME field: field cannot be empty")
    private String firstName;
    @Column(name = "lastname")
    @Size(min = 2, max = 35, message = "LASTNAME field: must be between 2 and 35 characters")
    @NotBlank(message = "LASTNAME field: field cannot be empty")
    private String lastName;
    @Column(name = "email")
    private String email;

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}