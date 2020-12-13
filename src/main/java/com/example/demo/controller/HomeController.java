package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "", produces = "application/json")
class HomeController {

    /*
     * home mapping
     */
    @GetMapping(path="/home")
    public ResponseEntity<String> findAll() {

        String result = String.format("{\"%s\":\"%s\"}", "message", "hello world!");
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
}