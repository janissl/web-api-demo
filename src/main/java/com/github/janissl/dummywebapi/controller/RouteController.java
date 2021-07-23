package com.github.janissl.dummywebapi.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
    ObjectNode objectNode;

    public RouteController() {
        ObjectMapper mapper = new ObjectMapper();
        objectNode = mapper.createObjectNode();
        objectNode.put("Vilnius", 10.00);
        objectNode.put("Tallinn", 9.00);
    }

    @GetMapping(path="/baseprice/{destination}")
    public Double getBasePrice(@PathVariable String destination) {
        JsonNode basePrice = objectNode.get(destination);

        if (null == basePrice) {
            return -1.00;
        } else {
            return basePrice.asDouble();
        }
    }
}
