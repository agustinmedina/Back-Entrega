package com.example.portfolioMedina.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "info_user")
@Entity
public class Info implements Serializable { @Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false, updatable = false, name = "id_info")
private Long idInfo;

    @Column(name = "name_info", length = 100, nullable = false)
    private String nameInfo;

    @Column(name = "surname_info", length = 100, nullable = false)
    private String surnameInfo;

    @Column(name = "title_info", length = 100, nullable = false)
    private String titleInfo;
    @Column(name = "desc_info", length = 1000, nullable = false)
    private String descriptionInfo;
    @Column(name = "pic_info", length = 1000, nullable = false)
    private String profilePic;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Education> educationList;

    /*
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experience> experienceListList;
    */

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Project> projectList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillsListList;

    public Info() {
    }

    public Info(Long idInfo, String nameInfo, String surnameInfo, String titleInfo, String descriptionInfo, String profilePic) {
        this.idInfo = idInfo;
        this.nameInfo = nameInfo;
        this.surnameInfo = surnameInfo;
        this.titleInfo = titleInfo;
        this.descriptionInfo = descriptionInfo;
        this.profilePic = profilePic;
    }

    public Long getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(Long idInfo) {
        this.idInfo = idInfo;
    }

    public String getNameInfo() {
        return nameInfo;
    }

    public void setNameInfo(String nameInfo) {
        this.nameInfo = nameInfo;
    }

    public String getSurnameInfo() {
        return surnameInfo;
    }

    public void setSurnameInfo(String surnameInfo) {
        this.surnameInfo = surnameInfo;
    }

    public String getTitleInfo() {
        return titleInfo;
    }

    public void setTitleInfo(String title) {
        this.titleInfo = title;
    }

    public String getDescriptionInfo() {
        return descriptionInfo;
    }

    public void setDescriptionInfo(String descriptionInfo) {
        this.descriptionInfo = descriptionInfo;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
