package com.example.demo.mapper;

import com.example.demo.dto.AlertResponse;
import com.example.demo.entity.Alert;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface AlertMapper {
    @Mapping(source = "machine.suspectedReason", target = "suspectedReason")
    @Mapping(source = "machine.actionRequired", target = "actionRequired")
    @Mapping(source = "machine.comment", target = "comment")
    AlertResponse mapToAlertDto(Alert alert);

    default Long mapLocaldatetimetoLong(LocalDateTime localDateTime) {
        return localDateTime.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
    }
}
