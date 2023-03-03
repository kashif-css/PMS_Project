package com.example.pms_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pms_project.model.Admin_entity;

@Repository
public interface AdminRepository extends JpaRepository<Admin_entity,Long>
{

}
