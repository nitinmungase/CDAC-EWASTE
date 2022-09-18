package com.springrest.springrest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.Donor;

@Repository
public interface DonorDao extends CrudRepository<Donor, Long> {

}
