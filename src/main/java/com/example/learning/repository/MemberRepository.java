package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.entity.MemberEntity;

@Repository

public interface MemberRepository extends JpaRepository<MemberEntity, Integer>{

}
