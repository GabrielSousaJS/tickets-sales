package com.gabrielsousa.ticketssales.resources;

import com.gabrielsousa.ticketssales.entities.ShowType;
import com.gabrielsousa.ticketssales.services.ShowTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/showtypes")
public class ShowTypeResource {

    @Autowired
    private ShowTypeService service;

    @GetMapping
    public ResponseEntity<List<ShowType>> findAll() {
        List<ShowType> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ShowType findById(@PathVariable Long id) {
        ShowType obj = service.findById(id);
        return obj;
    }
}
