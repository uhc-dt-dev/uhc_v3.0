package com.uhc.station.branch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uhc.station.branch.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> {

}
