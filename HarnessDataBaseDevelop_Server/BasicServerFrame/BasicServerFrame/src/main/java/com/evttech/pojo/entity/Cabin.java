package com.evttech.pojo.entity;

import com.evttech.pojo.relation.CabinLinkNodeRe;
import com.evttech.pojo.relation.IncludeSegmentRe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Node(labels = {"Cabin"})
public class Cabin extends BaseNode{

    @Property(name = "name")
    private String name;

    //TODO 目前认为只有一个连接点
    @Relationship(type = "tailLink", direction = Relationship.Direction.OUTGOING)
    private CabinLinkNodeRe tailLink;

    @Relationship(type = "headLink", direction = Relationship.Direction.OUTGOING)
    private CabinLinkNodeRe headLink;

    @Relationship(type = "includeSegment", direction = Relationship.Direction.OUTGOING)
    private List<IncludeSegmentRe> IncludesegmentReList = new ArrayList<>();

}
