package com.cmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@Autowired
	//TempVehicleService tempVehicleService;

	@RequestMapping("/register")
	public ModelAndView registerUser(@ModelAttribute TempVehicleEntity tempVehicleEntity) {
		return null;

//		List<String> genderList = new List<String>();
//		genderList.add("male");
//		genderList.add("female");
//
//		List<String> cityList = new ArrayList<String>();
//		cityList.add("delhi");
//		cityList.add("gurgaon");
//		cityList.add("meerut");
//		cityList.add("noida");
//
//		Map<String, List> map = new HashMap<String, List>();
//		map.put("genderList", genderList);
//		map.put("cityList", cityList);
//		return new ModelAndView("register", "map", map);
	}

	@RequestMapping("/insert")
	public String inserData(@ModelAttribute TempVehicleEntity tempVehicleEntity) {
		if (tempVehicleEntity != null)
			//tempVehicleService.insertData(tempVehicleEntity);
		return "redirect:/getList";
		return null;
	}

	@RequestMapping("/getList")
	public ModelAndView getTempVehicleList() {
		return null;
//		List<tempVehicleEntity> userList = tempVehicleService.();
//		return new ModelAndView("tempVehicleList", "tempVehicleList", tempVehicleEntity);
	}

//	@RequestMapping("/edit")
//	public ModelAndView editUser(@RequestParam String id,
//			@ModelAttribute TempVehicleEntity tempVehicleEntity) {
//
//		tempVehicleEntity = TempVehicleEntity.(TempVehicleEntity);
//
//		List<String> genderList = new ArrayList<String>();
//		genderList.add("male");
//		genderList.add("female");
//
//		List<String> cityList = new ArrayList<String>();
//		cityList.add("delhi");
//		cityList.add("gurgaon");
//		cityList.add("meerut");
//		cityList.add("noida");
//
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("genderList", genderList);
//		map.put("cityList", cityList);
//		map.put("user", user);
//
//		return new ModelAndView("edit", "map", map);
//
//	}

	@RequestMapping("/update")
	public String updateUser(@ModelAttribute TempVehicleEntity tempVehicleEntity) {
//		tempVehicleService.updateData(tempVehicleEntity);
		return "redirect:/getList";

	}

	@RequestMapping("/delete")
	public String deleteUser(@RequestParam String id) {
		System.out.println("id = " + id);
//		tempVehicleService.deleteData(id);
		return "redirect:/getList";
	}
}