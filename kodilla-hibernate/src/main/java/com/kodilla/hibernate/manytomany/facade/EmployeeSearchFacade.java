package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public final class EmployeeSearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeSearchFacade.class);

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> retrieveEmployeeLike(String employeeName) {
        return employeeDao.retrieveEmployeeLike(employeeName);
    }
}
