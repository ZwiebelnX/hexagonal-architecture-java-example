package com.csc.hexarch.application.domain.hexarch;

import com.csc.hexarch.application.domain.core.Repository;

public interface HexArchRepository extends Repository {

    String getHello();

    void saveValue(String value);
}
