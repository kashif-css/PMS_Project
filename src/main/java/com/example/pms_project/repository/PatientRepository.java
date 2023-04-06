package com.example.pms_project.repository;

import com.example.pms_project.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByMobileNo(Long mobileNo);
    Patient findByEmailAndPassword(String email,String password);

}
