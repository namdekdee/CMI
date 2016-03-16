package com.cmi.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class TempVehicleDaoImpl implements TempVehicleDao {

	//@Autowired
	DataSource dataSource;

	@Override
	public void insertTempVehicle(TempVehicleEntity tempVehicle) {
		String sql = "INSERT INTO tempvehical "
				+ "(first_name,last_name, gender, city) VALUES (?, ?, ?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql, new Object[] { tempVehicle.getMake(),
				tempVehicle.getModel(), tempVehicle.getModelDescription(),
				tempVehicle.getBodyType(), tempVehicle.getSubbodyType(),
				tempVehicle.getUsage(), tempVehicle.getManufactureYear(),
				tempVehicle.getSeatNumber() });

	}

	@Override
	public void updateData(TempVehicleEntity tempVehicle) {
		String sql = "UPDATE tempVehicleEntity set Make = ?,Model = ?, ModelDescription = ?, BodyType = ?, SubbodyType=?, Usage=?,ManufactureYear=?,SeatNumber=? where user_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql, new Object[] { tempVehicle.getMake(),
				tempVehicle.getModel(), tempVehicle.getModelDescription(),
				tempVehicle.getBodyType(), tempVehicle.getSubbodyType(),
				tempVehicle.getUsage(), tempVehicle.getManufactureYear(),
				tempVehicle.getSeatNumber() });

	}

	@Override
	public void deleteTempVehicle(Integer tempVehicleID) {
		String sql = "delete from tempVehicleEntity where user_id="
				+ tempVehicleID;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TempVehicleEntity> getAllTempVehicle() {
		return null;

	}

}
