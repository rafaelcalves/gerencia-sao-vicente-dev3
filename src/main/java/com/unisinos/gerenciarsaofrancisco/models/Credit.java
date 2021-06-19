package com.unisinos.gerenciarsaofrancisco.models;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

//Changed as heroku DB has a table named "user" as default
@Entity(name = "credit")
@DynamicUpdate
@Inheritance(strategy = InheritanceType.JOINED)
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "owner")
    @NotEmpty
    private String owner;

    @Column(name = "cvv")
	@NotEmpty
    private int cvv;

	@Column(name = "cardNumber")
	@NotEmpty
    private String cardNumber;


    @Column(name = "expiration_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dob;

	@Column(name = "credit_cards")
	@NotEmpty
    private String creditCards;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner=owner;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv=cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber=cardNumber;
    }

	 public String getCreditcards() {
        return creditCards;
    }
	
	public void setCreditCards(String cardNumber) {
        this.creditCards=creditCards;
    }
}
