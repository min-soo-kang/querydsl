package com.jpa.querydsl.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class TC_SIDO_INFO {

    @Id
    private String sido_cd;
    @Setter
    @Column
    private String sido_nm;
    @Setter
    @Column
    private String cmptinst_cd;
    @Setter
    @Column
    private String geom;

}
