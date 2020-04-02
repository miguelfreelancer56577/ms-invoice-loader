package com.github.mangelt.ms.invoice.loader.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.mangelt.ms.invoice.loader.dao.Comprobante;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
//@SpringBootTest
@DataMongoTest
@Slf4j
@TestPropertySource(locations = "classpath:application-test.properties")
public class ComprobanteRepositoryTest {
	
	@Autowired
	private ComprobanteRepository comRep;
	
	private Comprobante comp;
	
	/**
	 * creates a dummy comprobante to be persisted.
	 */
	@Before
	public void setUp() {
		comp = new Comprobante();
		comp.setId(UUID.randomUUID().toString());
		log.info("Comprobante created: " + comp.toString());
		comRep.save(comp);
	}
	
	/**
	 * Verifies that the comprobate already exits in MongoDB
	 */
	@Test
	public void fetchData() {
		
		List<Comprobante> findAll = comRep.findAll();
		
		assertThat(findAll).isNotNull().isNotEmpty();
		
	}
	
	/**
	 * cleans up the record from hbase.
	 */
	@After
	public void cleanUp() {
		comRep.delete(comp);
	}
}
