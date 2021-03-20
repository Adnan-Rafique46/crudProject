package com.TallyMarks.GrantsManagementInformationSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ExportMarket ")
public class ExportMarket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String exportMarket;

	@ManyToOne
	@JoinColumn(name = "PreformanceInformation")
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

	public String getExportMarket() {
		return exportMarket;
	}

	public void setExportMarket(String exportMarket) {
		this.exportMarket = exportMarket;
	}

	public PreformanceInformation getPreformanceInformation() {
		return preformanceInformation;
	}

	public void setPreformanceInformation(PreformanceInformation preformanceInformation) {
		this.preformanceInformation = preformanceInformation;
	}

}
