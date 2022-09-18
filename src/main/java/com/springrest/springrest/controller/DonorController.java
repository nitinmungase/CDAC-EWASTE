package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Donor;
import com.springrest.springrest.services.DonorService;

@RestController
public class DonorController {

	@Autowired
	private DonorService donorservices;

	@GetMapping("/getall")
	public Iterable<Donor> getDonors() {
		return donorservices.listAll();
	}

	@PostMapping(value = "/save")
	private long saveDonor(@RequestBody Donor donors) {
		donorservices.saveOrUpdate(donors);
		return donors.getDonorid();
	}

	@RequestMapping("/donor/{donorid}")
	private Donor getDonor(@PathVariable(name = "donorid") int donorid) {
		return donorservices.getStudentById(donorid);
	}

	@PutMapping("/donor/edit/{donorid}")
	private Donor update(@RequestBody Donor donors) {
		donorservices.saveOrUpdate(donors);
		return donors;
	}

	@DeleteMapping("/delete/{donorid}")
	private void deleteDonor(@PathVariable("donorid") int donorid) {
		donorservices.delete(donorid);
	}

}
