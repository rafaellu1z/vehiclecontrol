package com.vehiclecontrol.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
	
	private Long id;
	private String name;
	private String email;
	private Integer cpf;
	private Date birthDate;
	
	private List<Vehicle> vehicles = new ArrayList<>();
	
	public Client() {
	}

	public Client(Long id, String name, String email, Integer cpf, Date birthDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.birthDate = birthDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

}
