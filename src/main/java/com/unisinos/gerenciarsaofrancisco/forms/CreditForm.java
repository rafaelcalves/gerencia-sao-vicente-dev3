package com.unisinos.gerenciarsaofrancisco.forms;

import javax.validation.constraints.NotNull;

public class CreditForm {
    private int id;
    @NotNull
    private String owner;
    @NotNull
    private String cardNumber;
    @NotNull
    private int cvv;
    @NotNull
    private String credit_cards;

    @NotNull
    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCredit_cards() {
        return credit_cards;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setCredit_Cards(String credit_cards) {
        this.credit_cards = credit_cards;
    }

}