package com.evttech.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.neo4j.core.schema.DynamicLabels;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseNode implements Serializable {
    @Serial
    private static final long serialVersionUID = -3928832861296252415L;
    @Id
    @GeneratedValue
    private Long id;

    @DynamicLabels
    private Set<String> labels;

    public void addLabels(String... label) {
        if (labels == null) {
            labels = new HashSet<>();
        }

        Collections.addAll(labels, label);
    }
}
