package com.example.portfolioMedina.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "education")
public class Education implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_edu")
    private Long idEdu;

    @Column(length = 255, nullable = false, name = "title_edu")
    private String titleEdu;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "start_edu", columnDefinition = "DATE", nullable = false)
    private LocalDate startDateEdu;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "end_edu",  columnDefinition = "DATE", nullable = false)
    private LocalDate endDateEdu;

    @Column(length = 500, name = "desc_edu", nullable = false)
    private String descEdu;

    @Column(length = 1000, name = "pic_edu", nullable = false)
    private String picEdu;

    public Education() {
    }

    public Education(Long idEdu, String titleEdu, LocalDate startDateEdu, LocalDate endDateEdu, String descEdu, String picEdu) {
        this.idEdu = idEdu;
        this.titleEdu = titleEdu;
        this.startDateEdu = startDateEdu;
        this.endDateEdu = endDateEdu;
        this.descEdu = descEdu;
        this.picEdu = picEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTitleEdu() {
        return titleEdu;
    }

    public void setTitleEdu(String titleEdu) {
        this.titleEdu = titleEdu;
    }

    public LocalDate getStartDateEdu() {
        return startDateEdu;
    }

    public void setStartDateEdu(LocalDate startDateEdu) {
        this.startDateEdu = startDateEdu;
    }

    public LocalDate getEndDateEdu() {
        return endDateEdu;
    }

    public void setEndDateEdu(LocalDate endDateEdu) {
        this.endDateEdu = endDateEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getPicEdu() {
        return picEdu;
    }

    public void setPicEdu(String picEdu) {
        this.picEdu = picEdu;
    }
}