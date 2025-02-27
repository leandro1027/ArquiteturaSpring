package com.example.ArquiteturaSpring.montadora;

import java.awt.*;

public class RenaultLogan extends Carro{
    public RenaultLogan(Motor motor) {
        super(motor);
        setModelo("Logan");
        setCor(Color.DARK_GRAY);
        setMontadora(Montadora.RENAULT);
    }

}
