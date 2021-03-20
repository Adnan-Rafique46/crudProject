package com.TallyMarks.GrantsManagementInformationSystem.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.TallyMarks.GrantsManagementInformationSystem.Dto.ProductServiceDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.asm.Advice.This;

@Data
@Entity
@Table(name = "tbl_PreformanceInformation")

public class PreformanceInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int totalNoEmployees;
	private int totalNoPermanent;
	private int totalNoFemale;
	private int totalNoTemporary;

	@OneToMany(cascade = CascadeType.ALL)

	@JsonIgnoreProperties("PreformanceInformation")
	private List<ProductService> productService;

	@OneToMany(cascade = CascadeType.ALL)

	private List<Sales> Sales;

	@OneToMany(cascade = CascadeType.ALL)
	private List<ExportMarket> exportMarket;

	@OneToMany(cascade = CascadeType.ALL)
	private List<LocalMarket> localMarket;

	@OneToMany(cascade = CascadeType.ALL)
	private List<ExportMaterials> exportMaterials;

	@OneToMany(cascade = CascadeType.ALL)
	private List<LocalMaterials> localMaterials;

	public void add(ProductService productService) {

		productService.setPreformanceInformation(this);
	}

	public void add(Sales sales) {

		sales.setPreformanceInformation(this);

	}

	public void add(ExportMarket exportMarket) {
		exportMarket.setPreformanceInformation(this);

	}

	public void add(LocalMarket localMarket) {
		localMarket.setPreformanceInformation(this);
	}

	public void add(ExportMaterials exportMaterials) {
		exportMaterials.setPreformanceInformation(this);
	}

	public void add(LocalMaterials localMaterials) {
		localMaterials.setPreformanceInformation(this);
	}

	public List<ExportMarket> getExportMarket() {
		return exportMarket;
	}

	public void setExportMarket(List<ExportMarket> exportMarket) {
		this.exportMarket = exportMarket;
	}

	public List<LocalMarket> getLocalMarket() {
		return localMarket;
	}

	public void setLocalMarket(List<LocalMarket> localMarket) {
		this.localMarket = localMarket;
	}

	public List<ExportMaterials> getExportMaterials() {
		return exportMaterials;
	}

	public void setExportMaterials(List<ExportMaterials> exportMaterials) {
		this.exportMaterials = exportMaterials;
	}

	public List<LocalMaterials> getLocalMaterials() {
		return localMaterials;
	}

	public void setLocalMaterials(List<LocalMaterials> localMaterials) {
		this.localMaterials = localMaterials;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getTotalNoEmployees() {
		return totalNoEmployees;
	}

	public void setTotalNoEmployees(int totalNoEmployees) {
		this.totalNoEmployees = totalNoEmployees;
	}

	public int getTotalNoPermanent() {
		return totalNoPermanent;
	}

	public void setTotalNoPermanent(int totalNoPermanent) {
		this.totalNoPermanent = totalNoPermanent;
	}

	public int getTotalNoFemale() {
		return totalNoFemale;
	}

	public void setTotalNoFemale(int totalNoFemale) {
		this.totalNoFemale = totalNoFemale;
	}

	public int getTotalNoTemporary() {
		return totalNoTemporary;
	}

	public void setTotalNoTemporary(int totalNoTemporary) {
		this.totalNoTemporary = totalNoTemporary;
	}

	public List<ProductService> getProductService() {
		return productService;
	}

	public void setProductService(List<ProductService> productService) {
		this.productService = productService;
	}

	public List<Sales> getSales() {
		return Sales;
	}

	public void setSales(List<Sales> sales) {
		Sales = sales;
	}

}
