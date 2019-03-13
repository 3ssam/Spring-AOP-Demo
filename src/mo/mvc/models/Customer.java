package mo.mvc.models;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import validations.CourseCode;
import validations.EssamValidation;

public class Customer {

	@NotNull(message="is requied")
	private String firstName;

	@NotNull(message="is requied")
	@Size(min = 2,message = "length of the name should be 2 charceter at least")
	private String lastName;
	
	@NotNull(message="is requied")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	private String country;
	
	private String favoriteLanguage;
	
	private String operatingsystem;
	
	@EssamValidation(value="ITSC",message="Starting woth ITSC")
	private String ID;
	

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getOperatingsystem() {
		return operatingsystem;
	}

	public void setOperatingsystem(String operatingsystem) {
		this.operatingsystem = operatingsystem;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	private LinkedHashMap<String,String> countryOptions;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fristName) {
		this.firstName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer() {
		super();
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("Bra", "Brazil");
		countryOptions.put("Fra", "France");
		countryOptions.put("Ger", "Germany");
		countryOptions.put("Ind", "India");
		countryOptions.put("USA", "Unit stats");
	}

	public Customer(@NotNull(message = "is requied") String firstName,
			@Size(min = 2, message = "length of the name should be 2 charceter at least") String lastName) {
		super();
		this.lastName = lastName;
	}
	
	
}
