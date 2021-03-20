package com.TallyMarks.GrantsManagementInformationSystem.Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TallyMarks.GrantsManagementInformationSystem.Dto.ExportMarketDto;
import com.TallyMarks.GrantsManagementInformationSystem.Dto.ExportMaterialsDto;
import com.TallyMarks.GrantsManagementInformationSystem.Dto.LocalMarketDto;
import com.TallyMarks.GrantsManagementInformationSystem.Dto.LocalMaterialsDto;
import com.TallyMarks.GrantsManagementInformationSystem.Dto.PreformanceInformationDto;
import com.TallyMarks.GrantsManagementInformationSystem.Dto.ProductServiceDto;
import com.TallyMarks.GrantsManagementInformationSystem.Dto.SalesDto;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.ExportMarket;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.ExportMaterials;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.LocalMarket;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.LocalMaterials;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.PreformanceInformation;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.ProductService;
import com.TallyMarks.GrantsManagementInformationSystem.Entity.Sales;
import com.TallyMarks.GrantsManagementInformationSystem.Service.InformationService;

@RestController
@RequestMapping("/api")
public class InformationController {

	private static Logger logger = LogManager.getLogger(InformationController.class);

	public void performSomeTask() {

		System.out.println(" \n   Hello world ...!   \n");

		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
	}

	@Autowired
	private InformationService service;

	@GetMapping("/Information")
	public List<PreformanceInformation> list() {
		return service.listAll();
	}

	@GetMapping("/Information/{id}")
	public ResponseEntity<PreformanceInformation> get(@PathVariable Integer id) {
		try {
			PreformanceInformation preformanceInformation = service.get(id);
			return new ResponseEntity<PreformanceInformation>(preformanceInformation, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<PreformanceInformation>(HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping("/postInformation")
	public String add(@RequestBody PreformanceInformationDto preformanceInformationDto) {
		System.out.println(preformanceInformationDto.getTotalNoEmployees());
		System.out.println(preformanceInformationDto.getTotalNoFemale());
		System.out.println(preformanceInformationDto.getTotalNoPermanent());
		System.out.println(preformanceInformationDto.getTotalNoTemporary());

		System.out.println(preformanceInformationDto.getProductServiceDto());

		List<ProductServiceDto> productServiceDto = preformanceInformationDto.getProductServiceDto();
		for (ProductServiceDto productServiceDto2 : productServiceDto) {
			System.out.println(productServiceDto2.getAnnualProductDelivery());
			System.out.println(productServiceDto2.getLastYearsProductDelivery());

		}

		System.out.println(preformanceInformationDto.getSalesDto());

		List<SalesDto> salesDto = preformanceInformationDto.getSalesDto();
		for (SalesDto salesDto2 : salesDto) {
			System.out.println(salesDto2.getExportSale());
			System.out.println(salesDto2.getLocalSale());
		}

		System.out.println(preformanceInformationDto.getLocalMarketDto());
		List<LocalMarketDto> localMarketDto = (preformanceInformationDto.getLocalMarketDto());
		for (LocalMarketDto localMarketDto2 : localMarketDto) {
			System.out.println(localMarketDto2.getName());
			System.out.println(localMarketDto2.getLocalMarket());
		}

		System.out.println(preformanceInformationDto.getExportMarketDto());
		List<ExportMarketDto> exportMarketDto = preformanceInformationDto.getExportMarketDto();
		for (ExportMarketDto exportMarketDto2 : exportMarketDto) {

			System.out.println(exportMarketDto2.getName());
			System.out.println(exportMarketDto2.getExportMarket());

		}

		System.out.println(preformanceInformationDto.getLocalMaterialsDto());
		List<LocalMaterialsDto> localMaterialsDto = preformanceInformationDto.getLocalMaterialsDto();
		for (LocalMaterialsDto localMaterialsDto2 : localMaterialsDto) {

			System.out.println(localMaterialsDto2.getName());
			System.out.println(localMaterialsDto2.getLocalMaterials());
		}

		System.out.println(preformanceInformationDto.getExportMaterialsDto());
		List<ExportMaterialsDto> exportMaterialsDto = preformanceInformationDto.getExportMaterialsDto();
		for (ExportMaterialsDto exportMaterialsDto2 : exportMaterialsDto) {

			System.out.println(exportMaterialsDto2.getName());
			System.out.println(exportMaterialsDto2.getExportMaterials());

		}

		PreformanceInformation preformanceInformation = new PreformanceInformation();

		preformanceInformation.setTotalNoEmployees(preformanceInformationDto.getTotalNoEmployees());

		preformanceInformation.setTotalNoFemale(preformanceInformationDto.getTotalNoFemale());
		preformanceInformation.setTotalNoPermanent(preformanceInformationDto.getTotalNoPermanent());
		preformanceInformation.setTotalNoTemporary(preformanceInformationDto.getTotalNoTemporary());

		/*
		 * int totalNoEmployees = 0; while (totalNoEmployees == 49) {
		 * System.out.println("here id not value available : ");
		 * 
		 * }
		 * 
		 * if (totalNoEmployees < 38) {
		 * 
		 * System.out.println("no more employyee will be adding here :" +
		 * totalNoEmployees);
		 * 
		 * break; } }
		 */
	List<ProductService> productService = new ArrayList<ProductService>();
	for(ProductServiceDto productServiceDto2:productServiceDto)
	{
		ProductService p1 = new ProductService();
		p1.setAnnualProductDelivery(productServiceDto2.getAnnualProductDelivery());
		p1.setLastYearsProductDelivery(productServiceDto2.getLastYearsProductDelivery());
		p1.setProductService(productServiceDto2.getProductService());
		productService.add(p1);
	}
	preformanceInformation.setProductService(productService);

	List<Sales> sales = new ArrayList<Sales>();

	for(SalesDto salesDto2:salesDto)
	{
		Sales s1 = new Sales();
		s1.setExportSale(salesDto2.getExportSale());
		s1.setLocalSale(salesDto2.getLocalSale());
		sales.add(s1);
	}preformanceInformation.setSales(sales);

	List<LocalMarket> localMarket = new ArrayList<LocalMarket>();for(
	LocalMarketDto localMarketDto2:localMarketDto)
	{

		LocalMarket localMark = new LocalMarket();

		localMark.setName(localMarketDto2.getName());
		localMark.setLocalMarket(localMarketDto2.getLocalMarket());

		localMarket.add(localMark);
	}

	preformanceInformation.setLocalMarket(localMarket);

	List<ExportMarket> exportMarket = new ArrayList<ExportMarket>();for(
	ExportMarketDto exportMarketDto2:exportMarketDto)
	{

		ExportMarket exportMark = new ExportMarket();
		exportMark.setName(exportMarketDto2.getName());
		exportMark.setExportMarket(exportMarketDto2.getExportMarket());

		exportMarket.add(exportMark);
	}

	preformanceInformation.setExportMarket(exportMarket);

	List<LocalMaterials> localMaterials = new ArrayList<LocalMaterials>();for(
	LocalMaterialsDto localMaterialsDto2:localMaterialsDto)
	{
		LocalMaterials localMater = new LocalMaterials();
		localMater.setName(localMaterialsDto2.getName());
		localMater.setLocalMaterials(localMaterialsDto2.getLocalMaterials());

		localMaterials.add(localMater);
	}

	preformanceInformation.setLocalMaterials(localMaterials);

	List<ExportMaterials> exportMaterials = new ArrayList<ExportMaterials>();for(
	ExportMaterialsDto exportMaterialsDto2:exportMaterialsDto)
	{
		ExportMaterials exportMater = new ExportMaterials();
		exportMater.setName(exportMaterialsDto2.getName());
		exportMater.setExportMaterials(exportMaterialsDto2.getExportMaterials());

		exportMaterials.add(exportMater);

	}

	preformanceInformation.setExportMaterials(exportMaterials);

	List<ProductService> productServicelist = preformanceInformation.getProductService();for(
	ProductService productService2:productServicelist)
	{

		preformanceInformation.add(productService2);

	}

	List<Sales> saleslist = preformanceInformation.getSales();for(
	Sales sales2:saleslist)
	{
		preformanceInformation.add(sales2);
	}

	List<LocalMarket> localMarketlist = preformanceInformation.getLocalMarket();for(
	LocalMarket localMarket2:localMarketlist)
	{

		preformanceInformation.add(localMarket2);
	}

	List<ExportMarket> ExportMarketlist = preformanceInformation.getExportMarket();for(
	ExportMarket exportMarket2:ExportMarketlist)
	{
		preformanceInformation.add(exportMarket2);

	}

	List<LocalMaterials> localMaterialslist = preformanceInformation.getLocalMaterials();for(
	LocalMaterials localMaterials2:localMaterialslist)
	{
		preformanceInformation.add(localMaterials2);
	}

	List<ExportMaterials> exportMaterialslist = preformanceInformation.getExportMaterials();for(
	ExportMaterials exportMaterials2:exportMaterialslist)
	{
		preformanceInformation.add(exportMaterials2);
	}

	service.save(preformanceInformation);return"success";

	}

	@PutMapping("/Information/{id}")
	public PreformanceInformationDto update(@RequestBody PreformanceInformationDto preformanceInformationDto,
			@PathVariable long id) {
		{

			service.updatePreformanceInformation(id, preformanceInformationDto);

			return preformanceInformationDto;
		}

	}

	@DeleteMapping("/Information/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
