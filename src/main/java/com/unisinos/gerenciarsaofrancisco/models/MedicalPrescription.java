package com.unisinos.gerenciarsaofrancisco.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity(name = "medical_prescription")
@DynamicUpdate
@Data
@NoArgsConstructor
public class MedicalPrescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @ManyToOne
    @JoinColumn(name="doctor_id")
    //private Doctor doctor;
    private User doctor;
    @Column(length=512)
    private String description;

    @Column
    private String patient;

    @Column
    private String medicine;
    @Column
    private String startDate;
    @Column
    private String endDate;

    @ManyToOne
    @JoinColumn(name="tratament_id")
    private Treatment treatment;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public User getDoctor()
    {
        return doctor;
    }

    public void setDoctor(User doctor)
    {
        this.doctor = doctor;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getPatient()
    {
        return patient;
    }

    public void setPatient(String patient)
    {
        this.patient = patient;
    }

    public String getMedicine()
    {
        return medicine;
    }

    public void setMedicine(String medicine)
    {
        this.medicine = medicine;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public Treatment getTreatment()
    {
        return treatment;
    }

    public void setTreatment(Treatment treatment)
    {
        this.treatment = treatment;
    }
}
