package com.TallyMarks.GrantsManagementInformationSystem.Dto;

import lombok.Data;

@Data
public class ProductServiceDto {
	private String name;
	private String productService;
	private String annualProductDelivery;
	private String lastYearsProductDelivery;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductService() {
		return productService;
	}
	public void setProductService(String productService) {
		this.productService = productService;
	}
	public String getAnnualProductDelivery() {
		return annualProductDelivery;
	}
	public void setAnnualProductDelivery(String annualProductDelivery) {
		this.annualProductDelivery = annualProductDelivery;
	}
	public String getLastYearsProductDelivery() {
		return lastYearsProductDelivery;
	}
	public void setLastYearsProductDelivery(String lastYearsProductDelivery) {
		this.lastYearsProductDelivery = lastYearsProductDelivery;
	}

	
}
