package com.evttech.dao;

import com.evttech.pojo.entity.Cabin;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabinRepository extends Neo4jRepository<Cabin,Long> {


}
