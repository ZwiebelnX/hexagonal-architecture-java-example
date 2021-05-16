package com.csc.hexarch.application.usecase;

import com.csc.hexarch.application.domain.hexarch.HexArchRepository;
import com.csc.hexarch.application.domain.hexarch.HexArchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HexArchUseCase {

    private final HexArchRepository hexArchRepository;

    private final HexArchService hexArchService;

    public String helloHexArch() {
        return hexArchRepository.getHello();
    }

    public void saveValue(String value) {
        hexArchService.saveValue(value);
    }
}
