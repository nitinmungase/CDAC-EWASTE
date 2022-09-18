package com.springrest.springrest.entities;

import javax.persistence.*;

@Entity
@Table(name="Donor")
public class Donor {

	@Id
    @Column(name="donorid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long donorid;
	
    private String dFullname;
  
    private String dUsername;
    
    private String dPassword;
 
    private String dMobilenumber;
 
    private String dAddress;

	public long getDonorid() {
		return donorid;
	}

	public void setDonorid(long donorid) {
		this.donorid = donorid;
	}

	public String getdFullname() {
		return dFullname;
	}

	@Override
	public String toString() {
		return "Donor [donorid=" + donorid + ", dFullname=" + dFullname + ", dUsername=" + dUsername + ", dPassword="
				+ dPassword + ", dMobilenumber=" + dMobilenumber + ", dAddress=" + dAddress + "]";
	}

	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donor(long donorid, String dFullname, String dUsername, String dPassword, String dMobilenumber,
			String dAddress) {
		super();
		this.donorid = donorid;
		this.dFullname = dFullname;
		this.dUsername = dUsername;
		this.dPassword = dPassword;
		this.dMobilenumber = dMobilenumber;
		this.dAddress = dAddress;
	}

	public void setdFullname(String dFullname) {
		this.dFullname = dFullname;
	}

	public String getdUsername() {
		return dUsername;
	}

	public void setdUsername(String dUsername) {
		this.dUsername = dUsername;
	}

	public String getdPassword() {
		return dPassword;
	}

	public void setdPassword(String dPassword) {
		this.dPassword = dPassword;
	}

	public String getdMobilenumber() {
		return dMobilenumber;
	}

	public void setdMobilenumber(String dMobilenumber) {
		this.dMobilenumber = dMobilenumber;
	}

	public String getdAddress() {
		return dAddress;
	}

	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}
	
}
