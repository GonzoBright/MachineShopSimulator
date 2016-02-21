package co.uk.tristanindustries;

public class CorporateBranch {
	private String entityName;
	private String entityCode;
	
	private String entityAccountingCurrency;
	
	private String entityAddress;
	private String entityCountryCode;
	
	private Company parentCompany;
	
	public CorporateBranch(String name) {
		this.entityName = name;
	}
	
	// Get-methods
	public String getName() {
		return this.entityName;
	}
	
	public String getCode() {
		return this.entityCode;
	}

	public String getAccountingCurrency() {
		return this.entityAccountingCurrency;
	}

	public String getAddress() {
		return this.entityAddress;
	}

	public String getCountryCode() {
		return this.entityCountryCode;
	}

	public Company getParentCompany() {
		return this.parentCompany;
	}
	
	// Set-methods
	public void setName(String name) {
		this.entityName = name;
	}
	
	public void setCode(String code) {
		this.entityCode = code;
	}

	public void setAccountingCurrency(String currency) {
		this.entityAccountingCurrency = currency;
	}

	public void setAddress(String address) {
		this.entityAddress = address;
	}
	
	public void setCountryCode(String country) {
		this.entityCountryCode = country;
	}
	
	public void setParentCompany(Company company) {
		this.parentCompany = company;
	}
}
