package com.oded.msscbeerservice.web.controller;

import com.oded.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer/")
@RestController
public class BeerController {

    @GetMapping("{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> saveNewBeer(@Validated @RequestBody BeerDto beerDto) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("{beerId}")
    public ResponseEntity<Void> updateBeerById(@PathVariable("beerId") UUID beerId, @Validated @RequestBody BeerDto beerDto) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
