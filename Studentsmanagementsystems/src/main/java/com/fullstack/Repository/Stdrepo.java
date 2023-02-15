package com.fullstack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.model.Students;

public interface Stdrepo extends JpaRepository<Students, Integer>{

}
