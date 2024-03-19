package com.evttech.dao;

import com.evttech.pojo.entity.Segment;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentRepository extends Neo4jRepository<Segment,Long> {
    

}