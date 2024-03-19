package com.evttech;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.*;

import java.util.ArrayList;
import java.util.List;

@Node("Person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id @GeneratedValue
    private Long id;

    @Property("name")
    private String name;

    @Relationship(type = "IS_FRIEND_OF", direction = Relationship.Direction.OUTGOING)
    private List<Friend> friends = new ArrayList<>();
}
