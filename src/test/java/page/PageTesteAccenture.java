package page;

public class PageTesteAccenture {
	
	//Enter Vehicle Data
	
	public String select_make = "//*[@id='make']/option[10]";
	public String input_egperformance = "engineperformance";
	public String input_data = "dateofmanufacture";
	public String select_seats = "//*[@id='numberofseats']/option[3]";
	public String select_fuel = "//*[@id='fuel']/option[3]";
	public String input_listprice = "listprice";
	public String input_license = "licenseplatenumber";
	public String input_milege = "annualmileage";
	public String button_next = "nextenterinsurantdata";
	
	//Enter Insurant Data
	
	public String input_firstname = "firstname";
	public String input_lastname = "lastname";
	public String input_birthdate = "birthdate";
	public String input_female = "//*[@id='insurance-form']/div/section[2]/div[4]/p/label[2]/span";
	public String input_streetaddress = "streetaddress";
	public String select_country = "//*[@id='country']/option[32]";
	public String input_zipcode = "zipcode";
	public String select_occupation = "//*[@id='occupation']/option[3]";
	public String select_hobby = "//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]";
	public String button_next_product = "nextenterproductdata";
	
	// Enter Product Data
	
	public String input_startdate = "startdate";
	public String select_Insurance = "//*[@id='insurancesum']/option[10]";
	public String select_merit = "//*[@id='meritrating']/option[10]";
	public String select_damage_insurance = "//*[@id='damageinsurance']/option[2]";
	public String select_optional_products = "//*[@id='insurance-form']/div/section[3]/div[5]/p/label[2]";
	public String select_courtesy_car = "//*[@id='courtesycar']/option[2]";
	public String button_next_priceoption = "nextselectpriceoption";
	
	// Select Price Option
	
	public String select_radio = "//*[@id='priceTable']/tfoot/tr/th[2]/label[3]";
	public String button_next_sendquote = "nextsendquote";
	
	// Send Quote
	
	public String input_email = "email";
	public String input_phone = "phone";
	public String input_username = "username";
	public String input_password = "password";
	public String input_passwordConfirm = "confirmpassword";
	public String textarea_comments = "Comments";
	public String button_sendemail = "sendemail";
	public String h2_success = "//h2[contains(text(),'Sending e-mail success!')]";
	

}
