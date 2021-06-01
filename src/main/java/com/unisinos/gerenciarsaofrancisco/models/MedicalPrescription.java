package com.unisinos.gerenciarsaofrancisco.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity(name = "medical_prescription")
@DynamicUpdate
@Data
@NoArgsConstructor
public class MedicalPrescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @OneToOne
    @JoinColumn(name="pk_doctor")
    private Doctor doctor;
    @Column(length=512)
    private String description;
    @OneToOne(cascade= CascadeType.ALL)
    @JoinTable(name="patient_medical_prescription",
            joinColumns={@JoinColumn(name="patient_id",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="medical_prescription_id",
                    referencedColumnName="id")})
    private Patient patient;
    @OneToOne
    @JoinColumn(name="pk_treatment")
    private Treatment treatment;


}
