package com.dio.live.model;

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
