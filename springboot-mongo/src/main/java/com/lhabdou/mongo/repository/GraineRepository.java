/**
 * 
 */
package com.lhabdou.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lhabdou.mongo.entities.Graine;

/**
 * @author asoilihi
 *
 */
@Repository
public interface GraineRepository extends MongoRepository<Graine, String> {

}
