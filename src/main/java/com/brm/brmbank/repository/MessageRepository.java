package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
