package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeePhone;

    private String[] devices;

    private List<String> ratings;

    private Set<Long> discountsUsed;

    private Map<String,Object> otherDetails;

    private JobDetails jobDetails;


}
