package com.example.ArquiteturaSpring.montadora;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
@NoArgsConstructor
public class Chave {

    private Montadora montadora;
    private  String tipo;
}
