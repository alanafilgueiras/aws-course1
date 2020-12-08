package com.awscourse.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class DetailedMachine extends Machine implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String javaVersion;
	private String javaVendor;
	private String javaVendorURL;
	
	public DetailedMachine(String ip, String name, String os, String architecture, String osVersion, String javaVersion,
			String javaVendor, String javaVendorURL) {
		super(ip, name, os, architecture, osVersion);
		this.javaVersion = javaVersion;
		this.javaVendor = javaVendor;
		this.javaVendorURL = javaVendorURL;
	}
	

}
