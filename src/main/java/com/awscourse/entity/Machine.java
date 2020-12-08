package com.awscourse.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Machine implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ip;
	private String name;
	private String os;
	private String architecture;
	private String osVersion;
	
	
	
}
