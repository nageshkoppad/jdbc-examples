package com.storage.hospital.service;

import com.storage.hospital.dto.HospitalDTO;
import com.storage.hospital.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {
   	
	public HospitalServiceImpl() {
		
	}

	@Override
	public boolean validateAndSave(HospitalDTO dto) {
	     int id=dto.getId();
	     String name=dto.getName();
	    String founder= dto.getFounder();
	    int since=dto.getSince();
	    String specilist=dto.getSpecilist();
	     if(id>0 && id<5000) {
	    	 System.out.println("looks valid");
	    	 if(name!=null && name.length()>3 && name.length()<50  && !name.contains("@") && !name.contains("#")) {
	    		 System.out.println("looks valid");
	    		 if(founder!=null && founder.length()>6 && founder.length()<50 && !founder.contains("@") && !founder.contains("#") ) { 
	    			 System.out.println("looks valid ");
	    			 if(since>1987 && since<2022) {
	    				 System.out.println("looks valid");
	    				 if(specilist!=null && specilist.length()>5 && specilist.length()<50 && !specilist.contains("@") && !specilist.contains("#")) {
	    					 System.out.println("looks all are valid");
	    					 HospitalRepositoryImpl impl=new HospitalRepositoryImpl();
	    					 impl.save(dto);
	    					 System.out.println(dto);
	   
	    				 }else {
	    					 System.err.println("invalid");
	    				 }
	    			 }else {
	    				 System.err.println("invalid");
	    			 }
	    		 }else {
	    			 System.err.println("invalid");
	    		 }
	    	 }else {
	    		 System.err.println("invalid");
	    	 }
	     }else {
	    	 System.err.println("invalid");
	     }
		return false;
    }
}
