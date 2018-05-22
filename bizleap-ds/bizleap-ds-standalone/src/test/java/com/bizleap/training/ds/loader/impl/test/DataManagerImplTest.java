package com.bizleap.training.ds.loader.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;
import com.bizleap.training.ds.loader.DataManager;
import com.bizleap.training.ds.service.EmployeeService;

public class DataManagerImplTest extends ServiceTest{
		
	@Autowired
	@Qualifier("dataManager")
	protected DataManager dataManager;	
	
	@Autowired 
	protected EmployeeService employeeService;	
	
	static Logger logger=Logger.getLogger(DataManagerImplTest.class);
	
				@Ignore
				@Test
				public void testGetAllEmployee() throws IOException, ServiceUnavailableException {        
				         
					assertNotNull(employeeService.getAllEmployee());
				    logger.info("Number of Employees : "+employeeService.getAllEmployee());
		            assertTrue(CollectionUtils.isNotEmpty(employeeService.getAllEmployee()));
				    assertEquals(9,employeeService.getAllEmployee().size());
			}
			
			 @Ignore
			 @Test
			 public void testGetAllCompany() throws IOException, ServiceUnavailableException {			         		         
				      assertNotNull(companyService.getAllCompany());
				      logger.info("Number of Companies : "+companyService.getAllCompany());
				      assertTrue(CollectionUtils.isNotEmpty(companyService.getAllCompany()));
				      assertEquals(3,companyService.getAllCompany().size());
			}
			
				@Ignore
				@Test
				public void testFindByEmployeeBoId() throws ServiceUnavailableException {
					assertNotNull(employeeService.findByEmployeeBoId("PER01"));
					logger.info("Company for this BoId : "+employeeService.findByEmployeeBoId("PER01"));
					assertTrue(CollectionUtils.isNotEmpty(employeeService.findByEmployeeBoId("PER01")));
					assertEquals(employeeService.findByEmployeeBoIdSingle("PER01"),employeeService.findByEmployeeBoId("PER01"));
				 
				}		
			
				@Ignore
				@Test
				public void testFindByCompanyBoId() throws ServiceUnavailableException {
					 assertNotNull(companyService.findByCompanyBoId("COMP01"));
					 logger.info("Company for this BoId : "+companyService.findByCompanyBoId("COMP01"));
					 assertTrue(CollectionUtils.isNotEmpty(companyService.findByCompanyBoId("COMP01")));
				     assertEquals(companyService.findByCompanyBoIdSingle("COMP01"),companyService.findByCompanyBoId("COMP01"));
					 
				}	
				@Ignore
				@Test
				public void testLoad() throws IOException, ServiceUnavailableException {
					dataManager.load();
		
					assertNotNull(dataManager.getEmployeeList());
					logger.info("Employee List: "+dataManager.getEmployeeList());

					assertTrue(CollectionUtils.isNotEmpty(dataManager.getEmployeeList()));
					assertEquals(9,dataManager.getEmployeeList().size());
		
					assertNotNull(dataManager.getCompanyList());
					logger.info("Company List: "+dataManager.getCompanyList());
					assertTrue(CollectionUtils.isNotEmpty(dataManager.getCompanyList()));
					assertEquals(3,dataManager.getCompanyList().size());
				}
	
				@Ignore
				@Test
				public void testLoadFalse() {
					assertTrue(false);	
				}

				}
