package com.iaricioglu.business.services.Impl;

import com.iaricioglu.business.dto.EmployeeDto;
import com.iaricioglu.business.services.EmployeeServices;
import com.iaricioglu.data.entity.EmployeeEntity;
import com.iaricioglu.data.repository.EmployeeRepository;
import com.iaricioglu.exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    // LIST
    // http:/localhost/8080/api/v1/employees
    @GetMapping("/employees")
    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeDto> listDto = new ArrayList<>();
        Iterable<EmployeeEntity> entities = employeeRepository.findAll();
        for (EmployeeEntity entity : entities) {
            EmployeeDto employeeDto = EntityToDto(entity);
            listDto.add(employeeDto);
        }
        return listDto;
    }

    // SAVE
    // http:/localhost/8080/api/v1/employees/
    @PostMapping("/employees")
    @Override
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = DtoToEntity(employeeDto);
        employeeRepository.save(employeeEntity);
        return employeeDto;
    }

    // FIND
    // http:/localhost/8080/api/v1/employees/1
    @GetMapping("/employees/{id}")
    @Override
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) throws Throwable {
        EmployeeEntity entity = (EmployeeEntity) employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id " + id));
        EmployeeDto employeeDto = EntityToDto(entity);
        return ResponseEntity.ok(employeeDto);
    }

    // UPDATE
    // http:/localhost/8080/api/v1/employees
    @PutMapping("/employees/{id}")
    @Override
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDetails) throws Throwable {
        EmployeeEntity employeeEntity = DtoToEntity(employeeDetails);
        EmployeeEntity entity = (EmployeeEntity) employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id " + id));

        entity.setFirstName(employeeEntity.getFirstName());
        entity.setLastName(employeeEntity.getLastName());
        entity.setEmailId(employeeEntity.getEmailId());

        EmployeeEntity updateEmployeeEntity = (EmployeeEntity) employeeRepository.save(entity);
        EmployeeDto employeeDto = EntityToDto(updateEmployeeEntity);
        return ResponseEntity.ok(employeeDto);
    }

    // DELETE
    // http:/localhost/8080/api/v1/employees/1
    @DeleteMapping("/employees/{id}")
    @Override
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id) throws Throwable {
        EmployeeEntity entity= (EmployeeEntity) employeeRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id " + id));
        employeeRepository.delete(entity);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Model Mapper
    // Entity ==> Dto' ya çeviriyor
    @Override
    public EmployeeDto EntityToDto(EmployeeEntity employeeEntity) {
        EmployeeDto enEmployeeDto = modelMapper.map(employeeEntity, EmployeeDto.class);
        return enEmployeeDto;
    }

    // Dto ==> Entity' ye çeviriyor
    @Override
    public EmployeeEntity DtoToEntity(EmployeeDto enEmployeeDto) {
        EmployeeEntity employeeEntity = modelMapper.map(enEmployeeDto, EmployeeEntity.class);
        return employeeEntity;
    }
}
