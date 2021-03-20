package com.TallyMarks.GrantsManagementInformationSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_LocalMaterials")
public class LocalMaterials {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String localMaterials;

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

	public String getLocalMaterials() {
		return localMaterials;
	}

	public void setLocalMaterials(String localMaterials) {
		this.localMaterials = localMaterials;
	}

	public PreformanceInformation getPreformanceInformation() {
		return preformanceInformation;
	}

	public void setPreformanceInformation(PreformanceInformation preformanceInformation) {
		this.preformanceInformation = preformanceInformation;
	}

}
