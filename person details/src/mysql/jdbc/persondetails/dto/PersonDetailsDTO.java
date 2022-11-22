package mysql.jdbc.persondetails.dto;
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
public class PersonDetailsDTO {
private int id;
private String name;
private String email;
private long mobileNo;
private String gender;
private String qualification;
private String married;
private String working;
private String companyName;
private int salary;
private int age;
private int experience;
private String location;
private String city;
private String state;
private String country;
private long aadharNo;
private long  panNo;
private String alive;
private long bankAccountNo;
}

