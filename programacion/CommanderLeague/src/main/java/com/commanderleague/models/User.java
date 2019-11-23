package com.commanderleague.models;

import java.io.File;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "user")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    @Column(name = "number_DCI")
    private String number_DCI;
    @Column(name = "password")
    @Length(min = 12, message = "*Your password must have at least 12 characters")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "nameUser")
    private String nameUser;
    @Column(name = "active")
    private int active;
    
    @Column(name="file")
    private File foto;
    public User() {
    }

    public User(String number_DCI, String password, String name, String nameUser, int active, File foto) {
        this.number_DCI = number_DCI;
        this.password = password;
        this.name = name;
        this.nameUser = nameUser;
        this.active = active;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber_DCI() {
        return number_DCI;
    }

    public void setNumber_DCI(String number_DCI) {
        this.number_DCI = number_DCI;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public File getFile() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int id;
        private String number_DCI;
        private String password;
        private String name;
        private String nameUser;
        private int active;
        private File foto;

        public Builder id(int id){
            this.id = id;
            return this;
        }


        public Builder number_DCI(String number_DCI){
            this.number_DCI = number_DCI;
            return this;
        }
        public Builder password(String password){
            this.password = password;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder nameUser(String nameUser){
            this.nameUser = nameUser;
            return this;
        }
        public Builder active(int active){
            this.active = active;
            return this;
        }
        public Builder files(File foto){
            this.foto = foto;
            return this;
        }

        public User build(){
            return new User( number_DCI, password, name, nameUser, active, foto);
        }
    }
}