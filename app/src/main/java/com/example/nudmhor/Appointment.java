package com.example.nudmhor;

import com.google.firebase.firestore.PropertyName;

public class Appointment {
    private String Age;
    private String Date;
    private String Height;
    private String Queue;
    private String Weight;
    private String clinic_id;
    private String clinic_treatment;
    private String doctor_id;
    private String symptom_description;
    private String user_id;

    public Appointment(){}

    public Appointment(String age, String date, String height, String queue, String weight, String clinic_id, String clinic_treatment, String doctor_id, String symptom_description, String user_id){
        this.Age = age;
        this.Date = date;
        this.Height = height;
        this.Queue = queue;
        this.Weight = weight;
        this.clinic_id = clinic_id;
        this.clinic_treatment = clinic_treatment;
        this.doctor_id = doctor_id;
        this.symptom_description = symptom_description;
        this.user_id = user_id;
    }
    @PropertyName("Age")
    public String getAge() {
        return Age;
    }

    @PropertyName("Date")
    public String getDate() {
        return Date;
    }

    @PropertyName("Height")
    public String getHeight() {
        return Height;
    }

    @PropertyName("Queue")
    public String getQueue() {
        return Queue;
    }

    @PropertyName("Weight")
    public String getWeight() {
        return Weight;
    }

    @PropertyName("clinic_id")
    public String getClinic_id() {
        return clinic_id;
    }

    @PropertyName("clinic_treatment")
    public String getClinic_treatment() {
        return clinic_treatment;
    }

    @PropertyName("doctor_id")
    public String getDoctor_id() {
        return doctor_id;
    }

    @PropertyName("symptom_description")
    public String getSymptom_description() {
        return symptom_description;
    }

    @PropertyName("user_id")
    public String getUser_id() {
        return user_id;
    }

    public String getDate_Queue(){return getDate()+ " " + getQueue();}
}
