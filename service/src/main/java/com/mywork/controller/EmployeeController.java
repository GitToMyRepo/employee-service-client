package com.mywork.controller;

import com.mywork.dto.EmployeeDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
class EmployeeController {

    @GetMapping("/details")
    public EmployeeDetails getEmployeeDetails() {
        // Simulate fetching employee details from a database or external service
        EmployeeDetails employeeDetails = new EmployeeDetails("John Doe", "john.doe@example.com", "Developer");
        return employeeDetails;
    }
}
