package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Course {
    private String description;
    private String code;
    private Double fee;
    private Integer duration;
}
