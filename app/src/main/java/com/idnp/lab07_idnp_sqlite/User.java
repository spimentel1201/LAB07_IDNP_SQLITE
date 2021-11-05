package com.idnp.lab07_idnp_sqlite;

import android.content.ContentValues;

import com.idnp.lab07_idnp_sqlite.data.UsersContract;

import java.util.UUID;

public class User {
    private String id;
    private String names;
    private String lastname;
    private String dni;
    private String email;
    private String phoneNumber;
    private String birthDate;

    public User(){

    }

    public User(String namesx,String lastnamex,String dnix,String emailx,String phoneNumberx,String birthDatex){
        this.id= UUID.randomUUID().toString();;
        this.names=namesx;
        this.lastname=lastnamex;
        this.dni=dnix;
        this.email=emailx;
        this.phoneNumber=phoneNumberx;
        this.birthDate=birthDatex;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UsersContract.UserEntry.ID,"U-001");
        contentValues.put(UsersContract.UserEntry.ID,"Cosme");
        contentValues.put(UsersContract.UserEntry.ID,"Fulanito Simpson");
        contentValues.put(UsersContract.UserEntry.ID,"74587845");
        contentValues.put(UsersContract.UserEntry.ID,"micorreo@gmail.com");
        contentValues.put(UsersContract.UserEntry.ID,"968574578");
        contentValues.put(UsersContract.UserEntry.ID,"01-05-1995");
        return contentValues;
    }
}
