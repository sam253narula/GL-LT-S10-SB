package com.example.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.LibraryExistService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/existService")
public class LibraryExistController {

	@Autowired
	LibraryExistService existService;
	
	@ApiOperation(value = "Check Library Exists By Id", notes = "This API allows you to check Library by Id")
	@GetMapping("/checkLibraryExistsById/{id}")
	public boolean checkLibraryExistsById(@PathVariable Long id) {
		return existService.checkLibraryExistsById(id);
	}
	
	@ApiOperation(value = "Check Library Exists By Example", notes = "This API allows you to check Library Exists By Example")
	@GetMapping("/checkLibraryExistsByExample")
	public boolean checkLibraryExistsByExample(String commaSeperatedBookNames) {
		return existService.checkLibraryExistsByExample(commaSeperatedBookNames);
	}
	
}
