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
import com.bizleap.training.ds.service.CompanyService;

public class CompanyServiceImplTest {

	
	static Logger logger=Logger.getLogger(CompanyServiceImplTest.class);

	@Autowired
	protected CompanyService companyService;
	
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
		public void testFindByCompanyBoId() throws ServiceUnavailableException {
			 assertNotNull(companyService.findByCompanyBoId("COMP01"));
			 logger.info("Company for this BoId : "+companyService.findByCompanyBoId("COMP01"));
			 assertTrue(CollectionUtils.isNotEmpty(companyService.findByCompanyBoId("COMP01")));
		     assertEquals(companyService.findByCompanyBoIdSingle("COMP01"),companyService.findByCompanyBoId("COMP01"));

			 
		}
}
