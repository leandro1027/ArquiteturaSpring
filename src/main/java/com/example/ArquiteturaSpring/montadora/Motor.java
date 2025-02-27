package com.example.ArquiteturaSpring.montadora;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Motor {

    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double quilometragem;
    private TipoMotor tipo;
}
