package com.TallyMarks.GrantsManagementInformationSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ExportMaterials")
public class ExportMaterials {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String exportMaterials;

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

	public String getExportMaterials() {
		return exportMaterials;
	}

	public void setExportMaterials(String exportMaterials) {
		this.exportMaterials = exportMaterials;
	}

	public PreformanceInformation getPreformanceInformation() {
		return preformanceInformation;
	}

	public void setPreformanceInformation(PreformanceInformation preformanceInformation) {
		this.preformanceInformation = preformanceInformation;
	}

}
