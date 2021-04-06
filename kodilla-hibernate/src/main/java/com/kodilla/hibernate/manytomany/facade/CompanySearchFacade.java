package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class CompanySearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanySearchFacade.class);

    @Autowired
    private CompanyDao companyDao;

    public List<Company> retrieveCompaniesName(String companyName) {
        return companyDao.retrieveCompaniesName(companyName);
    }
}
