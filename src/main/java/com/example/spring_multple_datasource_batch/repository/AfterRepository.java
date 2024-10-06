package com.example.spring_multple_datasource_batch.repository;

import com.example.spring_multple_datasource_batch.entity.AfterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AfterRepository extends JpaRepository<AfterEntity, Long> {
}