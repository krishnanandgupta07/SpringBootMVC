package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tourist {

	private Integer tid;
	private String tname;
	private Long mobileNumber;
	private String destLocation;
	private String fromLocation;
	private Double budget;
}
