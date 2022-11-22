package com.storage.hospital.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class HospitalDTO {
   private int id;
   private String name;
   private String founder;
   private int since;
   private String specilist; 
}
