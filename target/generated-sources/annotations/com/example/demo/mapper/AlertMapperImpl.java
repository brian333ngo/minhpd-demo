package com.example.demo.mapper;

import com.example.demo.dto.AlertResponse;
import com.example.demo.entity.Alert;
import com.example.demo.entity.Machine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-19T17:30:17+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class AlertMapperImpl implements AlertMapper {

    @Override
    public AlertResponse mapToAlertDto(Alert alert) {
        if ( alert == null ) {
            return null;
        }

        AlertResponse alertResponse = new AlertResponse();

        String suspectedReason = alertMachineSuspectedReason( alert );
        if ( suspectedReason != null ) {
            alertResponse.setSuspectedReason( suspectedReason );
        }
        String actionRequired = alertMachineActionRequired( alert );
        if ( actionRequired != null ) {
            alertResponse.setActionRequired( actionRequired );
        }
        String comment = alertMachineComment( alert );
        if ( comment != null ) {
            alertResponse.setComment( comment );
        }
        if ( alert.getId() != null ) {
            alertResponse.setId( alert.getId() );
        }
        if ( alert.getTitle() != null ) {
            alertResponse.setTitle( alert.getTitle() );
        }
        if ( alert.getDate() != null ) {
            alertResponse.setDate( mapLocaldatetimetoLong( alert.getDate() ) );
        }
        if ( alert.getNormalClip() != null ) {
            alertResponse.setNormalClip( alert.getNormalClip() );
        }
        if ( alert.getAbnormalClip() != null ) {
            alertResponse.setAbnormalClip( alert.getAbnormalClip() );
        }

        return alertResponse;
    }

    private String alertMachineSuspectedReason(Alert alert) {
        if ( alert == null ) {
            return null;
        }
        Machine machine = alert.getMachine();
        if ( machine == null ) {
            return null;
        }
        String suspectedReason = machine.getSuspectedReason();
        if ( suspectedReason == null ) {
            return null;
        }
        return suspectedReason;
    }

    private String alertMachineActionRequired(Alert alert) {
        if ( alert == null ) {
            return null;
        }
        Machine machine = alert.getMachine();
        if ( machine == null ) {
            return null;
        }
        String actionRequired = machine.getActionRequired();
        if ( actionRequired == null ) {
            return null;
        }
        return actionRequired;
    }

    private String alertMachineComment(Alert alert) {
        if ( alert == null ) {
            return null;
        }
        Machine machine = alert.getMachine();
        if ( machine == null ) {
            return null;
        }
        String comment = machine.getComment();
        if ( comment == null ) {
            return null;
        }
        return comment;
    }
}
