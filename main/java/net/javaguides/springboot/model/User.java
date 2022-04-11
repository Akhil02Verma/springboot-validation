package net.javaguides.springboot.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Table(name="users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name="name",nullable=false)
    //user nameshould not be null or empty
    // user name should have atleast 3 characters
    @NotEmpty
    @Size(max=10,message="user can have maximum 10 letters")
    private String name;
    //email should be a valid email format
    // email should not be null or empty
    @NotEmpty
    @Email
    private String email;
    //PASSWORD SHOULD NOT BE NULL OR EMPTY
    // PASSWORD SHOULD HAVE AT LEAST 8 CHARACTERS
    @NotEmpty
    @Size(min=8,message=" PASSWORD SHOULD HAVE AT LEAST 8 CHARACTERS")
    private String password;
    public User(){

}
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
