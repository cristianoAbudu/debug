package com.youtube.jovemtranquilao.debug.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube.jovemtranquilao.debug.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
}