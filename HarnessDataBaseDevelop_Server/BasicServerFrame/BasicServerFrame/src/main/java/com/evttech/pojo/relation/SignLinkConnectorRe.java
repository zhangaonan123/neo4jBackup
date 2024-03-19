package com.evttech.pojo.relation;

import com.evttech.pojo.entity.Connector;
import com.evttech.pojo.entity.Sign;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@EqualsAndHashCode(callSuper = true)
@RelationshipProperties
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignLinkConnectorRe extends BaseRelation{

    @TargetNode
    private Connector connector;
}
