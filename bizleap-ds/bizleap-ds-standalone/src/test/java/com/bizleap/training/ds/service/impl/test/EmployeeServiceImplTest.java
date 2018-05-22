package com.bizleap.training.ds.service.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;
import com.bizleap.training.ds.service.EmployeeService;

public class EmployeeServiceImplTest {
	
	static Logger logger=Logger.getLogger(EmployeeServiceImplTest.class);

	@Autowired
	protected EmployeeService employeeService;
	
        //@Ignore
		@Test
		public void testEmployee() throws IOException, ServiceUnavailableException {        
			         
			          assertNotNull(employeeService.getAllEmployee());
			          logger.info("Number of Employees : "+employeeService.getAllEmployee());
			          assertTrue(CollectionUtils.isNotEmpty(employeeService.getAllEmployee()));
			          assertEquals(9,employeeService.getAllEmployee().size());
		}
		
		@Ignore
		@Test
		public void testFindByEmployeeBoId() throws ServiceUnavailableException {
			 assertNotNull(employeeService.findByEmployeeBoId("PER01"));
			 logger.info("Company for this BoId : "+employeeService.findByEmployeeBoId("PER01"));
			 assertTrue(CollectionUtils.isNotEmpty(employeeService.findByEmployeeBoId("PER01")));
		     assertEquals(employeeService.findByEmployeeBoIdSingle("PER01"),employeeService.findByEmployeeBoId("PER01"));

			 
		}
}
