package com.rent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rent.dao.AdminDAO;
import com.rent.dao.VehicleTypeGroup;
import com.rent.model.VehicleType;
import com.rent.model.*;

@Service
public class AdminService_Impl implements AdminService{

	@Autowired
	AdminDAO adminDAO;
	
	@Transactional
	@Override
	public List<VehicleTypeGroup> get() {
		return adminDAO.get();
	}
	@Override
	public void save(VehicleType vt){
		adminDAO.save(vt);
	}
	public void deleteVehicletype(VehicleType vt) {
		String vtname = vt.getVehicle_type();
		adminDAO.deleteVehicletype(vtname);
	}
	public void updateVehicletype(String vtname, String price, int hours) {
		adminDAO.updateVehicletype(vtname,price,hours);
	}
	public void saveVehicle(Vehicle vehicle) {
		adminDAO.saveVehicle(vehicle);
	}
	
	public void deleteVehicle(Vehicle vehicle) {
		System.out.println("someting " + vehicle.getMake() + " got this");
		String vid = vehicle.getVid();
		adminDAO.deleteVehicle(vid);
	}
	public void updateVehicle(Vehicle vehicle) {
		adminDAO.updateVehicle(vehicle);
	}
}