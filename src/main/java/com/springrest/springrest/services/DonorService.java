package com.springrest.springrest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.DonorDao;
import com.springrest.springrest.entities.Donor;

@Service
public class DonorService {

	@Autowired
	private DonorDao donorDao;

	public Iterable<Donor> listAll() {
		return this.donorDao.findAll();
	}

	public void saveOrUpdate(Donor donors) {
		donorDao.save(donors);
	}

	public Donor getStudentById(long donorid) {
		return donorDao.findById(donorid).get();
	}

	public void update(Donor donors, int donorid) {
		donorDao.save(donors);
	}

	public void delete(long donorid) {
		donorDao.deleteById(donorid);
	}

}
