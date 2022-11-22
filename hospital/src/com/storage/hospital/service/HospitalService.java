package com.storage.hospital.service;

import com.storage.hospital.dto.HospitalDTO;

public interface HospitalService {
   boolean validateAndSave(HospitalDTO dto);
}
