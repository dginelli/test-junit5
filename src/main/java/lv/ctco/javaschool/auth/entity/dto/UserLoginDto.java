package lv.ctco.javaschool.auth.entity.dto;

public class UserLoginDto {
    private String username;
    private String password;
    private String email;
    private String phone;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}