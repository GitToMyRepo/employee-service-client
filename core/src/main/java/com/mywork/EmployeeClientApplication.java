package com.mywork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.mywork.dto.EmployeeDetails;

@SpringBootApplication
public class EmployeeClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeClientApplication.class, args);

        // Create a RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Invoke the endpoint and convert the response to a Java object
        String serviceUrl = "http://localhost:8080/employees/details";
        ResponseEntity<EmployeeDetails> responseEntity = restTemplate.getForEntity(serviceUrl, EmployeeDetails.class);
        EmployeeDetails employeeDetails = responseEntity.getBody();

        // Print the retrieved employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employeeDetails.getName());
        System.out.println("Email: " + employeeDetails.getEmail());
        System.out.println("Position: " + employeeDetails.getPosition());
    }
}
