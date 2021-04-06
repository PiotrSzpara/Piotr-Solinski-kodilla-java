package com.kodilla.hibernate.manytomany.facade;

public class FacadeException extends Exception{

    public static String ERR_COMPANY_SEARCH = "Company name searching is incorrect";
    public static String ERR_EMPLOYEE_SEARCH = "Employee name searching is incorrect";

    public FacadeException(String message) {
        super(message);
    }
}
