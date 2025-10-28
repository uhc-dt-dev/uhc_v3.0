package com.uhc.station.branch.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.uhc.station.branch.entity.QBranch;
import com.uhc.station.branch.response.Test;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class BranchCustomRepository {
	
	private final JPAQueryFactory queryFactory;
	
	private static final QBranch branch = QBranch.branch;
	
	public List<Test> test() {
		return queryFactory.select(
				Projections.constructor(
					Test.class,
	                branch.id
	            )
        )
        .from(branch)
        .fetch();
	}

}
