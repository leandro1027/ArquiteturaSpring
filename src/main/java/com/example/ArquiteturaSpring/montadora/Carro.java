package com.example.ArquiteturaSpring.montadora;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.awt.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Carro {
    private String modelo;
    private Color color;
    private Motor motor;
    private Montadora montadora;

    public Carro(Motor motor) {
        this.motor = motor;
    }
}
