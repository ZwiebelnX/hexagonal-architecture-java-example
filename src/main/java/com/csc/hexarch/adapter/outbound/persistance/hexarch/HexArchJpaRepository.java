package com.csc.hexarch.adapter.outbound.persistance.hexarch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HexArchJpaRepository extends JpaRepository<HexArchPO, String> {
}
