package com.dio.live.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class CategoriaUsuario {
    private long id;
    private String descricao;
}
