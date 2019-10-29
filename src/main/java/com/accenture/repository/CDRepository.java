package com.accenture.repository;

import com.accenture.modules.CD;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CDRepository extends CrudRepository<CD, Integer> {
}
