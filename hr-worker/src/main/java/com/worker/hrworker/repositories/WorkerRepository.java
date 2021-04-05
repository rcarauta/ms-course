package com.worker.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worker.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
