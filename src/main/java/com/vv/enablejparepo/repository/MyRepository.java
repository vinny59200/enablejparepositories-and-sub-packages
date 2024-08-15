package com.vv.enablejparepo.repository;

import com.vv.enablejparepo.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MyRepository extends JpaRepository<MyEntity, Long> {
}
