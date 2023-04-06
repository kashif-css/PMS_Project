package com.example.pms_project.repository;

import com.example.pms_project.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    Doctor findByMobileNo(Long mobileNo);
}
