package com.TallyMarks.GrantsManagementInformationSystem.Dto;

import java.util.List;

import com.TallyMarks.GrantsManagementInformationSystem.Entity.ExportMarket;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.ExportMaterials;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.LocalMarket;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.LocalMaterials;

import lombok.Data;

@Data

public class PreformanceInformationDto {

	private int totalNoEmployees;
	private int totalNoPermanent;
	private int totalNoFemale;
	private int totalNoTemporary;

	private List<ProductServiceDto> productServiceDto;

	private List<SalesDto> salesDto;

	private List<ExportMarketDto> exportMarketDto;

	private List<LocalMarketDto> localMarketDto;

	private List<ExportMaterialsDto> exportMaterialsDto;

	private List<LocalMaterialsDto> localMaterialsDto;

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

	public List<ProductServiceDto> getProductServiceDto() {
		return productServiceDto;
	}

	public void setProductServiceDto(List<ProductServiceDto> productServiceDto) {
		this.productServiceDto = productServiceDto;
	}

	public List<SalesDto> getSalesDto() {
		return salesDto;
	}

	public void setSalesDto(List<SalesDto> salesDto) {
		this.salesDto = salesDto;
	}

	public List<ExportMarketDto> getExportMarketDto() {
		return exportMarketDto;
	}

	public void setExportMarketDto(List<ExportMarketDto> exportMarketDto) {
		this.exportMarketDto = exportMarketDto;
	}

	public List<LocalMarketDto> getLocalMarketDto() {
		return localMarketDto;
	}

	public void setLocalMarketDto(List<LocalMarketDto> localMarketDto) {
		this.localMarketDto = localMarketDto;
	}

	public List<ExportMaterialsDto> getExportMaterialsDto() {
		return exportMaterialsDto;
	}

	public void setExportMaterialsDto(List<ExportMaterialsDto> exportMaterialsDto) {
		this.exportMaterialsDto = exportMaterialsDto;
	}

	public List<LocalMaterialsDto> getLocalMaterialsDto() {
		return localMaterialsDto;
	}

	public void setLocalMaterialsDto(List<LocalMaterialsDto> localMaterialsDto) {
		this.localMaterialsDto = localMaterialsDto;
	}

}
