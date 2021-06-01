package com.unisinos.gerenciarsaofrancisco.models;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity(name = "doctor")
@DynamicUpdate
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(length=15)
    private String ctm;
    @OneToOne
    @JoinColumn(name="pk_app_user")
    private User user;
    @OneToOne(mappedBy = "doctor")
    private MedicalPrescription medicalPrescription;


}
