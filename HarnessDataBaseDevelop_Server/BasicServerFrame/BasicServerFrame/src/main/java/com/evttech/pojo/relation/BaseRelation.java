package com.evttech.pojo.relation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseRelation implements Serializable {
    @Serial
    private static final long serialVersionUID = -3928832861296252415L;

    @Id
    @GeneratedValue
    private Long id;

}
