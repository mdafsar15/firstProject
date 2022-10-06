package com.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.model.FirstModel;

@Repository
public interface FirstRepository extends JpaRepository<FirstModel, Long> {

}
