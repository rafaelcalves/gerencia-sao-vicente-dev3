package com.unisinos.gerenciarsaofrancisco.models;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "medicine")
@DynamicUpdate
@Data
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column
    private LocalDate validate;
    @Column(name="comercial_name",length=30)
    private String comercialName;
    @Column
    private Integer amount;
    @Column(length=512)
    private String resume;
}
