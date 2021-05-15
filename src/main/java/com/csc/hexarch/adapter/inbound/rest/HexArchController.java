package com.csc.hexarch.adapter.inbound.rest;

import com.csc.hexarch.application.usecase.HexArchUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HexArchController {
    private final HexArchUseCase hexArchUseCase;

    @GetMapping("/hello-hex-arch")
    private String hello() {
        return hexArchUseCase.helloHexArch();
    }

    @PostMapping("/values/{value}")
    private void saveValues(@PathVariable String value) {
        hexArchUseCase.saveValue(value);
    }
}
