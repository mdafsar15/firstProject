package com.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.model.FirstModel;
import com.first.service.FirstService;

@RestController
@RequestMapping("bridge")
public class FirstController {

	@Autowired
	FirstService firstService;

	@PostMapping("/insert")
	public FirstModel insertEmployee(@RequestBody FirstModel first) {

		FirstModel control = firstService.insertEmployee(first);

		return control;
	}

}
