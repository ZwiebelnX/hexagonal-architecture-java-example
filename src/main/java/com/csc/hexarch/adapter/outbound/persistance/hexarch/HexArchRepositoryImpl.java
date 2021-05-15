package com.csc.hexarch.adapter.outbound.persistance.hexarch;

import com.csc.hexarch.application.domain.hexarch.HexArchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HexArchRepositoryImpl implements HexArchRepository {
    private final HexArchJpaRepository hexArchJpaRepository;


    @Override
    public String getHello() {
        return hexArchJpaRepository.findById("hello").orElseThrow(RuntimeException::new).getValue();
    }

    @Override
    public void saveValue(String value) {
        HexArchPO hexArchPO = HexArchPO.builder().id(value).value(value).build();
        hexArchJpaRepository.save(hexArchPO);
    }
}
