package com.uhc.station.branch.service;

import org.springframework.stereotype.Service;

import com.uhc.station.branch.repository.BranchCustomRepository;
import com.uhc.station.branch.repository.BranchRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminBranchService {

	private final BranchRepository branchRepository;
	
	private final BranchCustomRepository branchCustomRepository;

	public Object getAllBranch() {
		// TODO Auto-generated method stub
		branchRepository.findAll();
		return branchCustomRepository.test();
	}

}
