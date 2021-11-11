package com.application.wined.repository;

import com.application.wined.entity.Wine;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WineRepository extends JpaRepository<Wine, Long>
{

}
