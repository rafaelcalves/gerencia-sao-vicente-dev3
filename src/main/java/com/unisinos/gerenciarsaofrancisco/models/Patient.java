package com.unisinos.gerenciarsaofrancisco.models;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "patient")
@DynamicUpdate
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="patient_medical_prescription",
            joinColumns={@JoinColumn(name="patient_id",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="medical_prescription_id",
                    referencedColumnName="id")})
    private MedicalPrescription medicalPrescription;
    @Column(name = "start_date")
    private LocalDateTime startdDate;
    @Column
    private Integer age;
    @Column(length=512)
    private String description;

}
