package com.sb.jpa.jpa_demo_jc.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sb.jpa.jpa_demo_jc.Model.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface MyRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
    List<Employee> findById(long id);
    @Modifying
    @Transactional
    @Query("DELETE FROM Employee e WHERE e.id = :id")
    void deleteByID(@Param("id")long id);
    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.name = :name, e.email = :email, e.department = :dept WHERE e.id = :id")
    int updateEmployeeById(@Param("id") long id, @Param("name") String name, @Param("email") String email, @Param("dept") String dept);
    
}
