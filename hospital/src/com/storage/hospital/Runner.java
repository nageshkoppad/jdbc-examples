package com.storage.hospital;

import com.storage.hospital.dto.HospitalDTO;
import com.storage.hospital.repository.HospitalRepositoryImpl;
import com.storage.hospital.service.HospitalServiceImpl;

public class Runner {

	public static void main(String[] args) {
	
         HospitalDTO dto=new HospitalDTO(10,"jhgffccfc","cxddrdggff",2020,"ggfytfytc");
         HospitalServiceImpl many=new HospitalServiceImpl();
         many.validateAndSave(dto);      
	}

}
