package com.awscourse.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;
import com.awscourse.entity.Machine;
import com.awscourse.entity.DetailedMachine;

@Service
public class MachineService {
	
	//get machine information
	public 	 Machine getMachineInformation () throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		String ip = address.getHostAddress (); 
		String name = address.getHostName();
		String os = System.getProperty("os.name");
		String architecture = System.getProperty("os.arch");
		String osVersion = System.getProperty("os.Version");
		
		
		Machine machine = new Machine(ip, name, os, architecture, osVersion);
		
		return machine; 
	}
	
	
	//get detailed machine information
	public DetailedMachine getDetailedInformation () throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		String ip = address.getHostAddress (); 
		String name = address.getHostName();
		String os = System.getProperty("os.name");
		String architecture = System.getProperty("os.arch");
		String osVersion = System.getProperty("os.Version");
		String javaVersion = System.getProperty("java.version");
		String javaVendor = System.getProperty("java.vendor");
		String javaVendorUrl = System.getProperty("java.vendor.url");
		
		DetailedMachine detailedMachine = new DetailedMachine (ip, name, os, architecture, osVersion, javaVersion, javaVendor, javaVendorUrl);
		
		return detailedMachine;
	}
}
