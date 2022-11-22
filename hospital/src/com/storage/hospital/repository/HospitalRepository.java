package com.storage.hospital.repository;

import com.storage.hospital.dto.HospitalDTO;

public interface HospitalRepository {
  boolean save(HospitalDTO dto);
}
