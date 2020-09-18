package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ApplicationList;


@Repository
public interface ApplicationListRepository extends JpaRepository<ApplicationList, Long> {

}
