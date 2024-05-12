package com.ConnectWithMe.Users.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UserSkills")
@Entity
public class UserSkillsEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userID" , referencedColumnName = "id")
    private UsersEntity userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skillID" , referencedColumnName = "id")
    private SkillsEntity skillId;
}
