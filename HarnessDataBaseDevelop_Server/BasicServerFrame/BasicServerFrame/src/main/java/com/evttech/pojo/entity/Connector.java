package com.evttech.pojo.entity;

import com.evttech.pojo.relation.DeliverSignRe;
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
@Node(labels = {"Connector"})
public class Connector extends BaseNode{

    @Property(name = "name")
    private String name;

    @Relationship(type = "deliverSignReList", direction = Relationship.Direction.OUTGOING)
    private List<DeliverSignRe> deliverSignReList = new ArrayList<>();

}
