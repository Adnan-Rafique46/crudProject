package com.TallyMarks.GrantsManagementInformationSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.TallyMarks.GrantsManagementInformationSystem.Repository.InformationRepository;

@Service
@Transactional
public class InformationService {

	private static Logger logger = LogManager.getLogger(InformationService.class);

	public void performSomeTask() {

		System.out.println(" \n   Hello world ...!   \n");

		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
	}

	@Autowired
	private InformationRepository repo;

	public List<PreformanceInformation> listAll() {
		return repo.findAll();
	}

	public void save(PreformanceInformation preformanceInformation) {
		repo.save(preformanceInformation);
	}

	public PreformanceInformation get(long id) {
		return repo.findById(id).get();
	}

	public PreformanceInformation update(long id) {
		return repo.getOne(id);
	}

	public void updatePreformanceInformation(long id, PreformanceInformationDto preformanceInformationDto) {

		Optional<PreformanceInformation> existingPreformanceInformation = repo.findById(id);

		PreformanceInformation preformanceInformation = existingPreformanceInformation.get();
		preformanceInformation.setTotalNoEmployees(preformanceInformationDto.getTotalNoEmployees());
		preformanceInformation.setTotalNoFemale(preformanceInformationDto.getTotalNoFemale());
		preformanceInformation.setTotalNoPermanent(preformanceInformationDto.getTotalNoPermanent());
		preformanceInformation.setTotalNoTemporary(preformanceInformationDto.getTotalNoTemporary());

		List<ProductServiceDto> productServiceDto = preformanceInformationDto.getProductServiceDto();

		for (ProductServiceDto productServiceDto2 : productServiceDto) {
			System.out.println(productServiceDto2.getAnnualProductDelivery());
			System.out.println(productServiceDto2.getLastYearsProductDelivery());

		}

		System.out.println(preformanceInformationDto.getSalesDto());
		List<SalesDto> salesDto = new ArrayList<SalesDto>();
		for (SalesDto salesDto2 : salesDto) {

			System.out.println(salesDto2.getExportSale());
			System.out.println(salesDto2.getLocalSale());
		}

		System.out.println(preformanceInformationDto.getLocalMarketDto());

		List<LocalMarketDto> localMarketDto = new ArrayList<LocalMarketDto>();
		for (LocalMarketDto localMarketDto2 : localMarketDto) {

			System.out.println(localMarketDto2.getId());
			System.out.println(localMarketDto2.getName());
			System.out.println(localMarketDto2.getLocalMarket());
		}

		System.out.println(preformanceInformationDto.getExportMarketDto());
		List<ExportMarketDto> exportMarketDto = new ArrayList<ExportMarketDto>();
		for (ExportMarketDto exportMarketDto2 : exportMarketDto) {

			System.out.println(exportMarketDto2.getId());
			System.out.println(exportMarketDto2.getName());
			System.out.println(exportMarketDto2.getExportMarket());

		}

		System.out.println(preformanceInformationDto.getLocalMaterialsDto());
		List<LocalMaterialsDto> localMaterialsDto = new ArrayList<LocalMaterialsDto>();
		for (LocalMaterialsDto localMaterialsDto2 : localMaterialsDto) {

			System.out.println(localMaterialsDto2.getId());
			System.out.println(localMaterialsDto2.getName());
			System.out.println(localMaterialsDto2.getLocalMaterials());

		}

		System.out.println(preformanceInformationDto.getExportMaterialsDto());
		List<ExportMaterialsDto> exportMaterialsDto = new ArrayList<ExportMaterialsDto>();
		for (ExportMaterialsDto exportMaterialsDto2 : exportMaterialsDto) {

			System.out.println(exportMaterialsDto2.getId());
			System.out.println(exportMaterialsDto2.getName());
			System.out.println(exportMaterialsDto2.getExportMaterials());

		}

		PreformanceInformation preformanceInformation1 = new PreformanceInformation();

		preformanceInformation1.setTotalNoEmployees(preformanceInformationDto.getTotalNoEmployees());

		preformanceInformation1.setTotalNoFemale(preformanceInformationDto.getTotalNoEmployees());
		preformanceInformation1.setTotalNoPermanent(preformanceInformationDto.getTotalNoPermanent());
		preformanceInformation1.setTotalNoTemporary(preformanceInformationDto.getTotalNoTemporary());

		/*
		 * for (int PreformanceInformation=0; PreformanceInformation < 40;
		 * PreformanceInformation++) {
		 * 
		 * if (PreformanceInformation > 40) { System.out.println("Breaking"); break ; }
		 */
		List<ProductService> productService = new ArrayList<ProductService>();
		for (ProductServiceDto productServiceDto2 : productServiceDto) {
			ProductService p1 = new ProductService();
			p1.setAnnualProductDelivery(productServiceDto2.getAnnualProductDelivery());
			p1.setName(productServiceDto2.getName());
			p1.setLastYearsProductDelivery(productServiceDto2.getLastYearsProductDelivery());
			p1.setProductService(productServiceDto2.getProductService());

			productService.add(p1);
		}

		preformanceInformation1.setProductService(productService);

		List<Sales> sales = new ArrayList<Sales>();
		for (SalesDto salesDto2 : salesDto) {

			Sales s1 = new Sales();
			s1.setExportSale(salesDto2.getExportSale());
			s1.setLocalSale(salesDto2.getLocalSale());
			sales.add(s1);
		}
		preformanceInformation1.setSales(sales);

		List<LocalMarket> localMarket = new ArrayList<LocalMarket>();
		for (LocalMarketDto localMarketDto2 : localMarketDto) {
			LocalMarket localMarket1 = new LocalMarket();
			localMarket1.setName(localMarketDto2.getLocalMarket());
			localMarket1.setLocalMarket(localMarketDto2.getLocalMarket());
			localMarket1.setName(localMarketDto2.getName());
			localMarket.add(localMarket1);

		}

		preformanceInformation1.setLocalMarket(localMarket);

		List<ExportMarket> exportMarket = new ArrayList<ExportMarket>();
		for (ExportMarketDto exportMarketDto2 : exportMarketDto) {
			ExportMarket exportMarket1 = new ExportMarket();

			exportMarket1.setExportMarket(exportMarketDto2.getExportMarket());
			exportMarket1.setName(exportMarketDto2.getName());
			exportMarket.add(exportMarket1);

		}

		preformanceInformation1.setExportMarket(exportMarket);

		List<LocalMaterials> localMaterials = new ArrayList<LocalMaterials>();
		for (LocalMaterialsDto localMaterialsDto2 : localMaterialsDto) {
			LocalMaterials localMaterials1 = new LocalMaterials();

			localMaterials1.setName(localMaterialsDto2.getName());
			localMaterials1.setLocalMaterials(localMaterialsDto2.getLocalMaterials());

			localMaterials.add(localMaterials1);

		}

		preformanceInformation1.setLocalMaterials(localMaterials);

		List<ExportMaterials> exportMaterials = new ArrayList<ExportMaterials>();
		for (ExportMaterialsDto exportMaterialsDto2 : exportMaterialsDto) {
			ExportMaterials exportMaterials1 = new ExportMaterials();

			exportMaterials1.setName(exportMaterialsDto2.getName());
			exportMaterials1.setExportMaterials(exportMaterialsDto2.getExportMaterials());

			exportMaterials.add(exportMaterials1);

		}

		preformanceInformation1.setExportMarket(exportMarket);

		List<ProductService> ProductServiceList = preformanceInformation1.getProductService();
		for (ProductService productService2 : ProductServiceList) {
			preformanceInformation1.add(productService2);
		}
		List<Sales> salesList = preformanceInformation1.getSales();
		for (Sales sales2 : salesList) {
			preformanceInformation1.add(sales2);
		}

		List<LocalMarket> localMarketList = preformanceInformation1.getLocalMarket();
		for (LocalMarket localMarket2 : localMarketList) {

			preformanceInformation1.add(localMarket2);
		}
		List<ExportMarket> exportMarketList = preformanceInformation1.getExportMarket();
		for (ExportMarket exportMarket2 : exportMarketList) {
			preformanceInformation1.add(exportMarket2);
		}
		List<LocalMaterials> localMaterialsList = preformanceInformation1.getLocalMaterials();
		for (LocalMaterials localMaterials2 : localMaterialsList) {
			preformanceInformation1.add(localMaterials2);
		}
		List<ExportMaterials> exportMaterialsList = preformanceInformation1.getExportMaterials();
		for (ExportMaterials exportMaterials2 : exportMaterialsList) {
			preformanceInformation1.add(exportMaterials2);

			repo.findById(id);
		}

	}

	public void delete(long id) {
		repo.deleteById(id);
	}

}
