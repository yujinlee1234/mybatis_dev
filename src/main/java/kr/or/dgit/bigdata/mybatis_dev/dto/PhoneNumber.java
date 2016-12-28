package kr.or.dgit.bigdata.mybatis_dev.dto;

public class PhoneNumber {
	private String countryCode;
	private String stateCode;
	private String number;
	
	public PhoneNumber() {}

	public PhoneNumber(String countryCode, String stateCode, String number) {
		super();
		this.countryCode = countryCode;
		this.stateCode = stateCode;
		this.number = number;
	}
	
	public PhoneNumber(String str){// str = "010-1111-1111"
		if(str!=null){
			String[] parts = str.split("-");
			if(parts.length>0){
				countryCode = parts[0];
			}
			if(parts.length>1){
				stateCode = parts[1];
			}
			if(parts.length>2){
				number = parts[2];
			}
		}
	}
}
