package com.TallyMarks.GrantsManagementInformationSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_Sales")
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String localSale;
	private String exportSale;

	@ManyToOne
	@JoinColumn(name = "PreformanceInformation_id")
	private PreformanceInformation PreformanceInformation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocalSale() {
		return localSale;
	}

	public void setLocalSale(String localSale) {
		this.localSale = localSale;
	}

	public String getExportSale() {
		return exportSale;
	}

	public void setExportSale(String exportSale) {
		this.exportSale = exportSale;
	}

	public PreformanceInformation getPreformanceInformation() {
		return PreformanceInformation;
	}

	public void setPreformanceInformation(PreformanceInformation preformanceInformation) {
		PreformanceInformation = preformanceInformation;
	}

}
