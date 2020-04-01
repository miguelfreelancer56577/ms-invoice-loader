package com.github.mangelt.ms.invoice.loader.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.github.mangelt.ms.invoice.loader.dao.Comprobante;

public interface ComprobanteRepository extends MongoRepository<Comprobante, String>{

}
