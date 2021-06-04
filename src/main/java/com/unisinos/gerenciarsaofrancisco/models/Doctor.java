package com.unisinos.gerenciarsaofrancisco.models;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity(name = "doctor")
@DynamicUpdate
@Data
@PrimaryKeyJoinColumn(name="ID")
public class Doctor extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(length=15)
    private String crm;
    @OneToMany(mappedBy = "doctor", targetEntity = MedicalPrescription.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedicalPrescription> medicalPrescriptions;


}
