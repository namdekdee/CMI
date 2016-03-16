package com.cmi.controller;

import java.util.List;

public interface TempVehicleDao {

	public void insertTempVehicle(TempVehicleEntity tempVehicle);

	public List<TempVehicleEntity> getAllTempVehicle();

	public void updateData(TempVehicleEntity tempVehicleEntity);

	public void deleteTempVehicle(Integer tempVehicleID);

	//public User getUser(String id);

}
