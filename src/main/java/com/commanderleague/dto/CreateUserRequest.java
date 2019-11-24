/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.commanderleague.dto;

import java.io.File;

/**
 *
 * @author hernan
 */
public class CreateUserRequest {
    
    private String number_DCI;
    private String password;
    private String name;
    private String nameUser;
    private int active;
     private File foto;

    public CreateUserRequest(String number_DCI, String password, String name, String nameUser, int active,File foto) {
        this.number_DCI = number_DCI;
        this.password = password;
        this.name = name;
        this.nameUser = nameUser;
        this.active = active;
        this.foto = foto;
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

    public String getNameUser() {
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

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }
    
    
}
