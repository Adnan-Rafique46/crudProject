package com.TallyMarks.GrantsManagementInformationSystem.Dto;

import lombok.Data;

@Data
public class SalesDto {
	private String localSale;
	private String exportSale;
	
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

	
}
