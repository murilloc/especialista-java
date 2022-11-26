package com.training.erp;

import com.training.erp.comercial.Pedido;
import com.training.erp.estoque.Produto;

// desnecessário
import java.lang.System;

public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Produto produto = new Produto();

        System.out.println("Olá");
    }
}
