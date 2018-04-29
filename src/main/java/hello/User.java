package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userID;

    private String userName;

    private String userPassword;

    private String userType;

    private String userEmail;

    private String userPhone;

    public Integer getId() {
        return userID;
    }

    public void setId(Integer id) {
        this.userID = id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }

    public String getType() {
        return userType;
    }

    public void setType(String type) {
        this.userType = type;
    }

    public String getPhone() {
        return userPhone;
    }
    
    public void setPhone(String phone) {
        this.userPhone = phone;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }

}