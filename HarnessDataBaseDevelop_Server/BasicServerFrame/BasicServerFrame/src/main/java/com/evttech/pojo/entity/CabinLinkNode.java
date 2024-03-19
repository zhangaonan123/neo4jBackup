package com.evttech.pojo.entity;

import com.evttech.pojo.relation.CabinNodeLinkCabinRe;
import com.evttech.pojo.relation.CabinNodeLinkSegmentRe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Node(labels = {"CabinLinkNode"})
public class CabinLinkNode extends BaseNode {

    @Property(name = "name")
    private String name;

    @Relationship(type = "tailSegmentLink", direction = Relationship.Direction.OUTGOING)
    private CabinNodeLinkSegmentRe tailSegmentLink;

    @Relationship(type = "headSegmentLink", direction = Relationship.Direction.OUTGOING)
    private CabinNodeLinkSegmentRe headSegmentLink;

    @Relationship(type = "tailCabinLink", direction = Relationship.Direction.OUTGOING)
    private CabinNodeLinkCabinRe tailCabinLink;

    @Relationship(type = "headCabinLink", direction = Relationship.Direction.OUTGOING)
    private CabinNodeLinkCabinRe headCabinLink;

}