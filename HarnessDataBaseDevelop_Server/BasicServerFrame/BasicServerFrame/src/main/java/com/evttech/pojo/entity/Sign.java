package com.evttech.pojo.entity;

import com.evttech.pojo.relation.CrossWireRe;
import com.evttech.pojo.relation.SignLinkConnectorRe;
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
@Node(labels = {"Sign"})
public class Sign extends BaseNode{

    @Property(name = "name")
    private String name;

    @Relationship(type = "crossWireRe", direction = Relationship.Direction.OUTGOING)
    private CrossWireRe crossWireRe;

    @Relationship(type = "headConnectorLink", direction = Relationship.Direction.OUTGOING)
    private SignLinkConnectorRe headLink;

    @Relationship(type = "tailConnectorLink", direction = Relationship.Direction.OUTGOING)
    private SignLinkConnectorRe tailLink;

}
