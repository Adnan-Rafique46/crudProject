package com.TallyMarks.GrantsManagementInformationSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_LocalMarket")
public class LocalMarket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String localMarket;

	@ManyToOne
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

	public String getLocalMarket() {
		return localMarket;
	}

	public void setLocalMarket(String localMarket) {
		this.localMarket = localMarket;
	}

	public PreformanceInformation getPreformanceInformation() {
		return preformanceInformation;
	}

	public void setPreformanceInformation(PreformanceInformation preformanceInformation) {
		this.preformanceInformation = preformanceInformation;
	}

}
