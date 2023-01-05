package com.jpa.querydsl.repository.impl;

import com.jpa.querydsl.dto.QTC_SIDO_INFO;
import com.jpa.querydsl.dto.TC_SIDO_INFO;
import com.jpa.querydsl.repository.TcSidoInfoRepoCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;
@SuppressWarnings("unused")
public class TcSodpOmfpRepoImpl  extends QuerydslRepositorySupport implements TcSidoInfoRepoCustom {

    private final JPAQueryFactory queryFactory;

    public TcSodpOmfpRepoImpl(JPAQueryFactory queryFactory, JPAQueryFactory queryFactory1) {
        super(TC_SIDO_INFO.class);
        this.queryFactory = queryFactory1;
    }

    @Override
    public List<TC_SIDO_INFO> findAll() {
        /**
         *  QClass queryDsl 컴파일시 생성되는 파일
         */
        QTC_SIDO_INFO sido_info = new QTC_SIDO_INFO("1");
        return from(sido_info).fetch();
    }
}
