package com.evttech.pojo.entity;

import com.evttech.pojo.relation.*;
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
@Node(labels = {"Segment"})
public class Segment extends BaseNode {

    @Property(name = "name")
    private String name;

    @Relationship(type = "tailSegmentLink", direction = Relationship.Direction.OUTGOING)
    private List<SegmentLinkRe> tailSegmentLinkList = new ArrayList<>();

    @Relationship(type = "headSegmentLink", direction = Relationship.Direction.OUTGOING)
    private List<SegmentLinkRe> headSegmentLinkList = new ArrayList<>();

    @Relationship(type = "belongCabin", direction = Relationship.Direction.OUTGOING)
    private BelongCabinRe belongCabinRe;

    @Relationship(type = "tailNodeLink", direction = Relationship.Direction.OUTGOING)
    private SegmentLinkNodeRe tailNodeLink;

    @Relationship(type = "headNodeLink", direction = Relationship.Direction.OUTGOING)
    private SegmentLinkNodeRe headNodeLink;

    @Relationship(type = "includeWireRe", direction = Relationship.Direction.OUTGOING)
    private List<IncludeWireRe> includeWireReList = new ArrayList<>();


}
