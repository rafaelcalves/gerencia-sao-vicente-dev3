package com.unisinos.gerenciarsaofrancisco.forms;

import javax.validation.constraints.NotNull;

public class CreditDonationForm
{
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String number;
    @NotNull
    private String cvv;
    @NotNull
    private Integer expirationMonth;
    @NotNull
    private Integer expirationYear;
    @NotNull
    private double value;


    @NotNull
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Integer getExpirationMonth()
    {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth)
    {
        this.expirationMonth = expirationMonth;
    }

    public Integer getExpirationYear()
    {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear)
    {
        this.expirationYear = expirationYear;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }
}
