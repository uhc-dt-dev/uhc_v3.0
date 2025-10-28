package com.uhc.station.branch.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Brand {
	UH_CONTINENTAL("UH CONTINENTAL")
	,UH_SUITE("UH SUITE")
	,UH_FLAT("UH FLAT");
	
	private final String name;
	
}
