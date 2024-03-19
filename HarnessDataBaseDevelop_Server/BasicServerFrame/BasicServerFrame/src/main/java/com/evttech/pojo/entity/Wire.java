package com.evttech.pojo.entity;

import com.evttech.pojo.relation.CrossSegmentRe;
import com.evttech.pojo.relation.IncludeSignRe;
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
@Node(labels = {"Wire"})
public class Wire extends BaseNode{

    @Property(name = "name")
    private String name;

    @Relationship(type = "crossSegmentRe", direction = Relationship.Direction.OUTGOING)
    private List<CrossSegmentRe> crossSegmentReList = new ArrayList<>();

    @Relationship(type = "includeSignRe", direction = Relationship.Direction.OUTGOING)
    private IncludeSignRe includeSignRe;

}
