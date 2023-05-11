package com.comp.compdock.repository;

import com.comp.compdock.entity.Consumers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumers, Integer> {
}
