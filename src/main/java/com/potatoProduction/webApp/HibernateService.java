package com.potatoProduction.webApp;

import com.potatoProduction.webApp.Entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class HibernateService {
    @Autowired
    private HibernateDao dao;

    @Transactional(readOnly = true)
    public List<Employee> getAll() {
        return dao.getAll(Employee.class);
    }
}
