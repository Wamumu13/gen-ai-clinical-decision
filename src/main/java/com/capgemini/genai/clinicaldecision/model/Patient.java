package com.capgemini.genai.clinicaldecision.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "document", unique = true, nullable = false)
    private String document;

    @Column(name = "numutente", unique = true, nullable = false)
    private String numUtente;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    private String gender; // e.g., Male, Female, Other

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "emergency_contact_name")
    private String emergencyContactName;

    @Column(name = "emergency_contact_phone")
    private String emergencyContactPhone;

    @Column(name = "medical_history", length = 500)
    private String medicalHistory;

    @Column(name = "allergies")
    private String allergies;

    @Column(name = "insurance_provider")
    private String insuranceProvider;

    @Column(name = "insurance_policy_number")
    private String insurancePolicyNumber;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;
}
