package com.example.securityspring.dto;

public class UserRegistrDto {

    private String firsName;
    private String email;
    private String password;

    public UserRegistrDto() {
    }

    public UserRegistrDto(String firsName, String email, String password) {
        this.firsName = firsName;
        this.email = email;
        this.password = password;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
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
