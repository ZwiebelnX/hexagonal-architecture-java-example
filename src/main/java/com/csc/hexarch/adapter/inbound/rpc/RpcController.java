package com.csc.hexarch.adapter.inbound.rpc;

import com.csc.hexarch.application.usecase.HexArchUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class RpcController {
    private final HexArchUseCase hexArchUseCase;
}
