/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import java.time.LocalDateTime;

/**
 * VjobCandidateEmployment generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`vJobCandidateEmployment`")
@IdClass(VjobCandidateEmploymentId.class)
public class VjobCandidateEmployment implements Serializable {

    private Integer jobCandidateId;
     
    private LocalDateTime emp_startDate;
     
    private LocalDateTime emp_endDate;
    private String emp_orgName;
    private String emp_jobTitle;
    private String emp_responsibility;
    private String emp_functionCategory;
    private String emp_industryCategory;
    private String emp_loc_countryRegion;
    private String emp_loc_state;
    private String emp_loc_city;

    @Id
    @Column(name = "`JobCandidateID`", nullable = false, scale = 0, precision = 10)
    public Integer getJobCandidateId() {
        return this.jobCandidateId;
    }

    public void setJobCandidateId(Integer jobCandidateId) {
        this.jobCandidateId = jobCandidateId;
    }

    @Id
    @Column(name = "`Emp.StartDate`", nullable = true)
    public LocalDateTime getEmp_startDate() {
        return this.emp_startDate;
    }

    public void setEmp_startDate(LocalDateTime emp_startDate) {
        this.emp_startDate = emp_startDate;
    }

    @Id
    @Column(name = "`Emp.EndDate`", nullable = true)
    public LocalDateTime getEmp_endDate() {
        return this.emp_endDate;
    }

    public void setEmp_endDate(LocalDateTime emp_endDate) {
        this.emp_endDate = emp_endDate;
    }

    @Id
    @Column(name = "`Emp.OrgName`", nullable = true, length = 100)
    public String getEmp_orgName() {
        return this.emp_orgName;
    }

    public void setEmp_orgName(String emp_orgName) {
        this.emp_orgName = emp_orgName;
    }

    @Id
    @Column(name = "`Emp.JobTitle`", nullable = true, length = 100)
    public String getEmp_jobTitle() {
        return this.emp_jobTitle;
    }

    public void setEmp_jobTitle(String emp_jobTitle) {
        this.emp_jobTitle = emp_jobTitle;
    }

    @Id
    @Column(name = "`Emp.Responsibility`", nullable = true, length = 2147483647)
    public String getEmp_responsibility() {
        return this.emp_responsibility;
    }

    public void setEmp_responsibility(String emp_responsibility) {
        this.emp_responsibility = emp_responsibility;
    }

    @Id
    @Column(name = "`Emp.FunctionCategory`", nullable = true, length = 2147483647)
    public String getEmp_functionCategory() {
        return this.emp_functionCategory;
    }

    public void setEmp_functionCategory(String emp_functionCategory) {
        this.emp_functionCategory = emp_functionCategory;
    }

    @Id
    @Column(name = "`Emp.IndustryCategory`", nullable = true, length = 2147483647)
    public String getEmp_industryCategory() {
        return this.emp_industryCategory;
    }

    public void setEmp_industryCategory(String emp_industryCategory) {
        this.emp_industryCategory = emp_industryCategory;
    }

    @Id
    @Column(name = "`Emp.Loc.CountryRegion`", nullable = true, length = 2147483647)
    public String getEmp_loc_countryRegion() {
        return this.emp_loc_countryRegion;
    }

    public void setEmp_loc_countryRegion(String emp_loc_countryRegion) {
        this.emp_loc_countryRegion = emp_loc_countryRegion;
    }

    @Id
    @Column(name = "`Emp.Loc.State`", nullable = true, length = 2147483647)
    public String getEmp_loc_state() {
        return this.emp_loc_state;
    }

    public void setEmp_loc_state(String emp_loc_state) {
        this.emp_loc_state = emp_loc_state;
    }

    @Id
    @Column(name = "`Emp.Loc.City`", nullable = true, length = 2147483647)
    public String getEmp_loc_city() {
        return this.emp_loc_city;
    }

    public void setEmp_loc_city(String emp_loc_city) {
        this.emp_loc_city = emp_loc_city;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VjobCandidateEmployment)) return false;
        final VjobCandidateEmployment vjobCandidateEmployment = (VjobCandidateEmployment) o;
        return Objects.equals(getJobCandidateId(), vjobCandidateEmployment.getJobCandidateId()) &&
                Objects.equals(getEmp_startDate(), vjobCandidateEmployment.getEmp_startDate()) &&
                Objects.equals(getEmp_endDate(), vjobCandidateEmployment.getEmp_endDate()) &&
                Objects.equals(getEmp_orgName(), vjobCandidateEmployment.getEmp_orgName()) &&
                Objects.equals(getEmp_jobTitle(), vjobCandidateEmployment.getEmp_jobTitle()) &&
                Objects.equals(getEmp_responsibility(), vjobCandidateEmployment.getEmp_responsibility()) &&
                Objects.equals(getEmp_functionCategory(), vjobCandidateEmployment.getEmp_functionCategory()) &&
                Objects.equals(getEmp_industryCategory(), vjobCandidateEmployment.getEmp_industryCategory()) &&
                Objects.equals(getEmp_loc_countryRegion(), vjobCandidateEmployment.getEmp_loc_countryRegion()) &&
                Objects.equals(getEmp_loc_state(), vjobCandidateEmployment.getEmp_loc_state()) &&
                Objects.equals(getEmp_loc_city(), vjobCandidateEmployment.getEmp_loc_city());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJobCandidateId(),
                getEmp_startDate(),
                getEmp_endDate(),
                getEmp_orgName(),
                getEmp_jobTitle(),
                getEmp_responsibility(),
                getEmp_functionCategory(),
                getEmp_industryCategory(),
                getEmp_loc_countryRegion(),
                getEmp_loc_state(),
                getEmp_loc_city());
    }
}

