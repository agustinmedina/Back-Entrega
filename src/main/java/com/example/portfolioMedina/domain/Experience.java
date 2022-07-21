package com.example.portfolioMedina.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "experience")
public class Experience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,name = "id_exp")
    private Long idExp;

    @Column(length = 255,nullable = false,name = "title_exp")
    private String titleExp;

    @Column(name = "start_Exp", columnDefinition = "DATE",nullable = false)
    private LocalDate startDateExp;

    @Column(name = "end_exp", columnDefinition = "DATE",nullable = false)
    private LocalDate endDateExp;

    @Column(length = 500,name = "desc_exp",nullable = false)
    private String descExp;

    @Column(length = 1000,name = "pic_exp",nullable = false)
    private String picExp;

    public Experience() {
    }

    public Experience(Long idExp, String titleExp, LocalDate startDateExp, LocalDate endDateExp, String descExp, String picExp) {
        this.idExp = idExp;
        this.titleExp = titleExp;
        this.startDateExp = startDateExp;
        this.endDateExp = endDateExp;
        this.descExp = descExp;
        this.picExp = picExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTitleExp() {
        return titleExp;
    }

    public void setTitleExp(String titleExp) {
        this.titleExp = titleExp;
    }

    public LocalDate getStartDateExp() {
        return startDateExp;
    }

    public void setStartDateExp(LocalDate startDateExp) {
        this.startDateExp = startDateExp;
    }

    public LocalDate getEndDateExp() {
        return endDateExp;
    }

    public void setEndDateExp(LocalDate endDateExp) {
        this.endDateExp = endDateExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getPicExp() {
        return picExp;
    }

    public void setPicExp(String picExp) {
        this.picExp = picExp;
    }
}


