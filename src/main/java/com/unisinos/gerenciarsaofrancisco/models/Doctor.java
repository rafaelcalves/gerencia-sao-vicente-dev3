package com.unisinos.gerenciarsaofrancisco.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity(name = "doctor")
@DynamicUpdate
@Data
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="ID")
public class Doctor extends User {

    @Column(length=15)
    private String crm;
    @OneToMany(mappedBy = "doctor", targetEntity = MedicalPrescription.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedicalPrescription> medicalPrescriptions;


}
