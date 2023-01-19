package com.example.demo.service;

import com.example.demo.dto.AlertResponse;
import com.example.demo.mapper.AlertMapper;
import com.example.demo.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlertService {

    @Autowired
    private AlertRepository alertRepository;

    @Autowired
    private AlertMapper alertMapper;


    public List<AlertResponse> getListAlert() {
        return alertRepository.findAll().stream().map(x -> alertMapper.mapToAlertDto(x)).collect(Collectors.toList());
    }
}
