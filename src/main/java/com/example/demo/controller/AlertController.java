package com.example.demo.controller;


import com.example.demo.dto.AlertResponse;
import com.example.demo.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlertController {

    @Autowired
    private AlertService alertService;

    @GetMapping("/alerts")
    public List<AlertResponse> getListAlert() {
       return  alertService.getListAlert();
    }
    @GetMapping("/alerts/{id}")
    public List<AlertResponse> geAlertById(@PathVariable("id") String id) {
        return null;
    };
}
