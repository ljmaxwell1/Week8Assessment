package main.repository;

/**
 *Larry J Maxwell - ljmaxwell1@dmacc.edu
 *CIS175 - Spring 2022
 *Mar 11, 2022
 **/



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.beans.Computers;

@Repository
public interface ComputersRepository extends JpaRepository<Computers, Long> { }


