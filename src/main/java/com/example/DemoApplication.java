package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.FullName;
import com.example.model.SpringBootAppInfo;
import com.example.service.LibraryCountService;

@SpringBootApplication
public class DemoApplication /* implements CommandLineRunner */ {

	
	@Autowired
	LibraryCountService countService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Runs on application start");
//		System.out.println(SpringBootAppInfo.builder().courseName("SB").courseType("IT")
//				.instrutorName(FullName.builder().firstName("Samarth").lastName("Narula").build()).build());
//		System.out.println("random");
//		System.out.println(countService.countLibraries());
//	}
	
}
