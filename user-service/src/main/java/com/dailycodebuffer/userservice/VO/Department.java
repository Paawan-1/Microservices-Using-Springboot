package com.dailycodebuffer.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long DepartmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
