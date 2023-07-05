package org.example;

import java.time.LocalDate;

public class Policy {
    public float RETIREE_PREMIUM = 7.50F;
    private LocalDate localDate;
    private String userName;
    private int birthYear;
    private boolean residency;
    private char retirementStatus;
    private float retireePremium;
    private float nonRetiredInState;
    private float nonRetiredOutState;

    Policy() {
        this.userName = "John Doe";
        this.birthYear = 0000;
        this.residency = true;
        this.retirementStatus = 'Y';
    }

    Policy(LocalDate localDate, String userName, int birthYear, boolean residency, char retirementStatus) {

    }

    // Getters & Setters


    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isResidency() {
        return residency;
    }

    public void setResidency(boolean residency) {
        this.residency = residency;
    }

    public char getRetirementStatus() {
        return retirementStatus;
    }

    public void setRetirementStatus(char retirementStatus) {
        this.retirementStatus = retirementStatus;
    }

    public float getRetireePremium() {
        // TODO: Write math code in here
        return retireePremium;
    }

    public void setRetireePremium(float retireePremium) {
        this.retireePremium = retireePremium;
    }

    public float getNonRetiredInState() {
        // TODO: Write math code in here
        return nonRetiredInState;
    }

    public void setNonRetiredInState(float nonRetiredInState) {
        this.nonRetiredInState = nonRetiredInState;
    }

    public float getNonRetiredOutState() {
        // TODO: Write math code in here
        return nonRetiredOutState;
    }

    public void setNonRetiredOutState(float nonRetiredOutState) {
        this.nonRetiredOutState = nonRetiredOutState;
    }

    // TODO: Finish this class and get formatted string wrote
}