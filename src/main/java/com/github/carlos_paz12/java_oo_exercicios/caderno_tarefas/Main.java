package com.github.carlos_paz12.java_oo_exercicios.caderno_tarefas;

import com.github.carlos_paz12.java_oo_exercicios.caderno_tarefas.model.CadernoTarefas;
import com.github.carlos_paz12.java_oo_exercicios.caderno_tarefas.model.Tarefa;

public class Main {

    public static void main(String[] args) {
        CadernoTarefas caderno = new CadernoTarefas(5);

        caderno.adicionar(new Tarefa("Estudar Java", "Estudar conceitos básicos de Java", 2));
        caderno.adicionar(new Tarefa("Fazer exercícios", "Resolver problemas de programação", 1));
        caderno.adicionar(new Tarefa("Comprar mantimentos", "Lista de compras para a semana", 3));

        System.out.println("Tarefas por ordem de prioridade:");
        caderno.listarTarefas();
    }

}
