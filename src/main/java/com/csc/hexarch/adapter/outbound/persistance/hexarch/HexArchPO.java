package com.csc.hexarch.adapter.outbound.persistance.hexarch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hex_arch")
public class HexArchPO {
    @Id
    private String id;

    private String value;

}
