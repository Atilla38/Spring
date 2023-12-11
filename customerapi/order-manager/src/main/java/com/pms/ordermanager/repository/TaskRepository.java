package com.pms.ordermanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.ordermanager.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
