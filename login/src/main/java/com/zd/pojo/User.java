package com.zd.pojo;

public class User {

    private Integer id ;
    private String username;
    private String password;
    private String phone;
    private String deleted;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", deleted='" + deleted + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String username, String password, String phone, String deleted) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.deleted = deleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
