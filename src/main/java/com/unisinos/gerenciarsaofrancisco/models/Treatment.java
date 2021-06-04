package com.unisinos.gerenciarsaofrancisco.models;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "patient")
@DynamicUpdate
@Data
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @OneToOne
    @JoinColumn(name="pk_medicine")
    private Medicine medicine;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @OneToMany(mappedBy = "Treatment", targetEntity = MedicalPrescription.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedicalPrescription> medicalPrescription;
}
