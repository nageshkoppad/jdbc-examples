package mysql.jdbc.persondetails;

import mysql.jdbc.persondetails.dto.PersonDetailsDTO;
import mysql.jdbc.persondetails.repository.PersonDetailsRepositoryImpl;
import mysql.jdbc.persondetails.service.PersonDetailsServiceImpl;

public class Tester {

	public static void main(String[] args) {
		//PersonDetailsDTO dto=new PersonDetailsDTO(77,"nagesh","nageshkoppad@gmail.com",9019374335l,"male","engineering","unmarried","software developer","google",23000,26,3,"btm layout","bangalore","karnataka","india",245515155312l,5421245788l,"alive",8455121525545l);
		PersonDetailsServiceImpl impl=new PersonDetailsServiceImpl();
		// impl.ValidateAndSave(dto1);
		
		//PersonDetailsDTO dto1=new PersonDetailsDTO(70,"akash","aksh45@gmail.com",9011545135l,"male","pharmcy","unmarried","clinic reception","Ayush clinic",20000,24,2,"kalyan layout","dharwad","karnataka","india",2244125455312l,2544545788l,"alive",4444421525545l);
		//impl.ValidateAndSave(dto1);
		
		//PersonDetailsDTO dto2=new PersonDetailsDTO(60,"bhuvan","bhuvan12445@gmail.com",5484245135l,"male","BSC","unmarried","teacher","kcd college",20000,24,2,"Jugli circle","dharwad","karnataka","india",16532125312l,2545522788l,"alive",455555555525545l);
		//impl.ValidateAndSave(dto2);
		
		PersonDetailsDTO dto4=new PersonDetailsDTO(7,"vishal","vishal12445@gmail.com",1455150135l,"male","B.com","unmarried","Tester","wipro",25000,23,2,"hubli","hubli","karnataka","india",00000001125312l,11223322788l,"alive",99990005555525545l);
	    impl.ValidateAndSave(dto4);
		

		PersonDetailsDTO dto5=new PersonDetailsDTO(49,"soumya","sahana12445@gmail.com",5484150135l,"female","Engineering","unmarried","software developer","infosys",200000,21,1,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto5);

		//PersonDetailsDTO dto6=new PersonDetailsDTO(1,"sahana","sahana12445@gmail.com",5484150135l,"female","Engineering","unmarried","software developer","infosys",200000,22,1,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	   // impl.ValidateAndSave(dto6);

		PersonDetailsDTO dto7=new PersonDetailsDTO(69,"sneha","sneha2855@gmail.com",1256650135l,"female","Engineering","unmarried","data anlyst","deloite",30000,25,3,"haveri","haveri","karnataka","india",2152211125312l,3333222788l,"alive",333333335555525545l);
	    impl.ValidateAndSave(dto7);

		PersonDetailsDTO dto8=new PersonDetailsDTO(35,"guru","guru12445@gmail.com",5214150135l,"male","m.tech","unmarried","tester","microsoft",40000,27,5,"indi","bhijapur","karnataka","india",15545451125312l,442233222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto8);

		PersonDetailsDTO dto9=new PersonDetailsDTO(1,"sahana","sahana12445@gmail.com",5484150135l,"female","Engineering","unmarried","Software testing & quality assurance","infosys",200000,22,1,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto9);

		PersonDetailsDTO dto10=new PersonDetailsDTO(1,"prerana","prerana12445@gmail.com",215542135l,"female","Engineering","unmarried","software developer","HCL Technologies",42000,26,4,"bang","bang","karnataka","india",2587425312l,2514252222788l,"alive",232145005555525545l);
	    impl.ValidateAndSave(dto10);

		PersonDetailsDTO dto11=new PersonDetailsDTO(1,"darshan","challanging12445@gmail.com",5482514135l,"male","mteck","married","Ms Office.","Tech Mahindra	",150000,32,7,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto11);

	    PersonDetailsDTO dto198=new PersonDetailsDTO(1,"sahana","sahana12445@gmail.com",5542150135l,"female","Engineering","unmarried","Web developers","Larsen & Toubro Infotech",200000,22,1,"mang","mang","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto198);
	    
		PersonDetailsDTO dto12=new PersonDetailsDTO(1,"yash","Rockin2445@gmail.com",54841554825l,"male","Engineering","unmarried","IT coordinator","Securiteam",200000,33,8,"haveri","haveri","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto12);

		PersonDetailsDTO dto13=new PersonDetailsDTO(1,"ganesh","golden12445@gmail.com",5412250135l,"male","Engineering","unmarried","System Analysts","Microsoft Corporation",200000,31,6,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto13);

		PersonDetailsDTO dto14=new PersonDetailsDTO(1,"upendra","upendra12445@gmail.com",5484150135l,"male","Engineering","unmarried","software developer","IBM",200000,22,1,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto14);

	    PersonDetailsDTO dto170=new PersonDetailsDTO(1,"sahana","sahana12445@gmail.com",5484150135l,"female","Engineering","unmarried","Solutions architect","Accenture",200000,24,3,"hubli","hubli","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto170);
	    
		PersonDetailsDTO dto15=new PersonDetailsDTO(1,"rachita","dimplequeen12445@gmail.com",5484150135l,"female","Engineering","unmarried","software developer developer developer","infosys",200000,22,1,"bellary","Bellary","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto15);

		PersonDetailsDTO dto16=new PersonDetailsDTO(1,"sahana","sahana12445@gmail.com",5484150135l,"female","Engineering","unmarried","Cloud infrastructure architect","DXC",200000,27,5,"bhidar","bhidar","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto16);

		PersonDetailsDTO dto17=new PersonDetailsDTO(1,"dhananjay","dollysahana12445@gmail.com",5484150135l,"male","Engineering","unmarried","Wireless network engineer","infosys",200000,22,1,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto17);

	    PersonDetailsDTO dto190=new PersonDetailsDTO(1,"sahana","sahana12445@gmail.com",5484150135l,"female","Engineering","unmarried","software developer","SAP",200000,28,6,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto190);
	    
		PersonDetailsDTO dto18=new PersonDetailsDTO(1,"prerana","prerana12445@gmail.com",5484150135l,"female","Engineering","unmarried","Solutions architect","infosys",200000,29,7,"bellary","Ballary","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto18);

		PersonDetailsDTO dto19=new PersonDetailsDTO(1,"sahana","sahana12445@gmail.com",5484150135l,"female","Engineering","unmarried","software developer","Accenture",200000,23,2,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto19);

	    PersonDetailsDTO dto130=new PersonDetailsDTO(1,"ganesh","golden12445@gmail.com",5484150135l,"male","Engineering","unmarried","Enterprise architect","infosys",70000,28,3,"Mysore","Mysore","karnataka","india",1461241125312l,22222222788l,"alive",0000005555525545l);
	    impl.ValidateAndSave(dto130);

		PersonDetailsDTO dto21=new PersonDetailsDTO(1,"sahana","sahana12445@gmail.com",5484150135l,"female","Engineering","unmarried","software developer","infosys",50000,35,12,"gokak","Belgaum","karnataka","india",1461241125312l,25522522788l,"alive",025221555525545l);
	    impl.ValidateAndSave(dto21);

	    PersonDetailsDTO dto111=new PersonDetailsDTO(1,"darshan","challanging12445@gmail.com",5482514135l,"male","mteck","married","software developer","TCS",152000,32,7,"gokak","Belgaum","karnataka","india",1461241125312l,22222222788l,"alive",0157005555525545l);
	    impl.ValidateAndSave(dto111);

		PersonDetailsDTO dto23=new PersonDetailsDTO(1,"sahana","sahana12445@gmail.com",5484150135l,"female","Engineering","unmarried","Technical architect","Oracle",100000,24,3,"Kalaburagi","Kalaburagi","karnataka","india",11544041125312l,220052422788l,"alive",0054520005555525545l);
	    impl.ValidateAndSave(dto23);

		
	}

}
