package com.pojo;

public class Doctor {
    private int id;
    private String doctorname;
    private String doctorgender;
    private int doctorage;
    private int doctorsalary;

    public Doctor(int id, String doctorname, String doctorgender, int doctorage, int doctorsalary) {
        this.id = id;
        this.doctorname = doctorname;
        this.doctorgender = doctorgender;
        this.doctorage = doctorage;
        this.doctorsalary = doctorsalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDoctorgender() {
        return doctorgender;
    }

    public void setDoctorgender(String doctorgender) {
        this.doctorgender = doctorgender;
    }

    public int getDoctorage() {
        return doctorage;
    }

    public void setDoctorage(int doctorage) {
        this.doctorage = doctorage;
    }

    public int getDoctorsalary() {
        return doctorsalary;
    }

    public void setDoctorsalary(int doctorsalary) {
        this.doctorsalary = doctorsalary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", doctorname='" + doctorname + '\'' +
                ", doctorgender='" + doctorgender + '\'' +
                ", doctorage=" + doctorage +
                ", doctorsalary=" + doctorsalary +
                '}';
    }
}
