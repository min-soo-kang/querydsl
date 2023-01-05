package com.jpa.querydsl.repository;

import com.jpa.querydsl.dto.TC_SIDO_INFO;

import java.util.List;

public interface TcSidoInfoRepoCustom {
    List<TC_SIDO_INFO> findAll();
}
