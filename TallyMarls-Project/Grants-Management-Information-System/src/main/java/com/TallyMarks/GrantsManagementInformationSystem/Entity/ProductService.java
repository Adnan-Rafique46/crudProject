package com.TallyMarks.GrantsManagementInformationSystem.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "tbl_ProductService")
public class ProductService {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String productService;
	private String annualProductDelivery;
	private String lastYearsProductDelivery;

	@ManyToOne
	@JsonIgnoreProperties("ProductService")
	@JoinColumn(name = "PreformanceInformation_id")
	private PreformanceInformation preformanceInformation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public PreformanceInformation getPreformanceInformation() {
		return preformanceInformation;
	}

	public void setPreformanceInformation(PreformanceInformation preformanceInformation) {
		this.preformanceInformation = preformanceInformation;
	}

}
