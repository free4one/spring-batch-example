package com.example.spring_multple_datasource_batch.repository;

import com.example.spring_multple_datasource_batch.entity.BeforeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeforeRepository extends JpaRepository<BeforeEntity, Long> {
}
