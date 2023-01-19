package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlertResponse {
    private Long id;
    private String title;
    private Long date;
    private String equipment;
    private String normalClip;
    private String abnormalClip;
    private String suspectedReason;
    private String actionRequired;
    private String comment;
    private String commentBy;
}
