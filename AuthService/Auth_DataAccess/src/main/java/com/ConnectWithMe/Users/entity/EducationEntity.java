package com.ConnectWithMe.Users.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Education")
@Entity
public class EducationEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CollegeInfoID" , referencedColumnName = "id")
    private CollegesInfoEntity collegesInfo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userID" , referencedColumnName = "id")
    private UsersEntity user;

    private Date StartDate;
    private Date EndDate;
    private String Degreetitlee;
    private String DegreeName;
}