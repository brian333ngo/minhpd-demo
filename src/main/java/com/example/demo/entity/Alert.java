package com.example.demo.entity;

import com.example.demo.enums.Anomaly;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alert {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private LocalDateTime date;
    @OneToOne(fetch = FetchType.EAGER)
    private Machine machine;
    private String normalClip;
    private String abnormalClip;
    private Anomaly anomaly;
}
