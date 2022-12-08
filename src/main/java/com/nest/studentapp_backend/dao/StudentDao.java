package com.nest.studentapp_backend.dao;

import com.nest.studentapp_backend.model.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Students,Integer> {
}
