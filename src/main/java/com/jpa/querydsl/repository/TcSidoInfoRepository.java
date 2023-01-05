package com.jpa.querydsl.repository;

import com.jpa.querydsl.dto.TC_SIDO_INFO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TcSidoInfoRepository extends JpaRepository<TC_SIDO_INFO, String>, TcSidoInfoRepoCustom  {
    List<TC_SIDO_INFO> findAll();
}
