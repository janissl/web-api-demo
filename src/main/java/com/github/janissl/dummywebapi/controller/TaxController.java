package com.github.janissl.dummywebapi.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class TaxController {
    ObjectNode objectNode;

    public TaxController() {
        ObjectMapper mapper = new ObjectMapper();
        objectNode = mapper.createObjectNode();
        objectNode.put("VAT", 21.0);
    }

    @GetMapping(path = "/taxes")
    public List<Double> getAllTaxes() {
        List<Double> applicableTaxes = new ArrayList<>();
        Iterator<JsonNode> iterator = objectNode.elements();

        while (iterator.hasNext()){
            applicableTaxes.add(iterator.next().asDouble());
        }

        return applicableTaxes;
    }
}
