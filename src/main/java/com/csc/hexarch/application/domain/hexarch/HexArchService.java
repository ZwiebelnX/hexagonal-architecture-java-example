package com.csc.hexarch.application.domain.hexarch;

import com.csc.hexarch.application.domain.core.DomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HexArchService implements DomainService {
    private final HexArchRepository hexArchRepository;

    public void saveValue(String value) {
        hexArchRepository.saveValue(value);
    }
}
