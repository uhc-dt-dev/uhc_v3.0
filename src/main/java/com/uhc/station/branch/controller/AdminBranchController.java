package com.uhc.station.branch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uhc.station.branch.service.AdminBranchService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/admin/branch")
@RequiredArgsConstructor
public class AdminBranchController {
	
	private final AdminBranchService adminBranchService;
	
	@GetMapping("/branches")
    ResponseEntity<?> getAllBranch() {
        return new ResponseEntity<>(adminBranchService.getAllBranch(), HttpStatus.OK);
    }
}
