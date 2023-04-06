package com.example.pms_project.repository;

import com.example.pms_project.entity.Receptionist;
import com.example.pms_project.entity.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionistRepository extends JpaRepository <Receptionist,Long>{
}
