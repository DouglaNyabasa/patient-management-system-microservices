package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId().toString());
        patientResponseDTO.setName(patient.getName());
        patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        patientResponseDTO.setAddress(patientResponseDTO.getAddress());
        patientResponseDTO.setEmail(patient.getEmail());
        return patientResponseDTO;

    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
       Patient patient = new Patient();
       patient.setAddress(patientRequestDTO.getAddress());
       patient.setEmail(patientRequestDTO.getEmail());
       patient.setName(patientRequestDTO.getName());
       patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getGetDateOfBirth()));
       patient.setRegistrationDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
        return patient;
    }
}
