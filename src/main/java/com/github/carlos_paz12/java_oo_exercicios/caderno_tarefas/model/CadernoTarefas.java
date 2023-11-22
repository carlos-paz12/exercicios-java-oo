package com.github.carlos_paz12.java_oo_exercicios.caderno_tarefas.model;

public class CadernoTarefas {

    private Tarefa[] tarefas;

    public CadernoTarefas(int quantidade) {
        tarefas = new Tarefa[quantidade];
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionar(Tarefa t) {
        for (int i = 0; i < tarefas.length; i++) {
            if (tarefas[i] == null) {
                tarefas[i] = t;
                return;
            }
        }
        System.out.println("O caderno de tarefas está cheio!");
    }

    public void listarTarefas() {
        for (int i = 0; i < tarefas.length - 1; i++) {
            for (int j = 0; j < tarefas.length - i - 1; j++) {
                if (tarefas[j] != null && tarefas[j + 1] != null && tarefas[j].getPrioridade() > tarefas[j + 1].getPrioridade()) {
                    Tarefa temp = tarefas[j];
                    tarefas[j] = tarefas[j + 1];
                    tarefas[j + 1] = temp;
                }
            }
        }

        for (Tarefa tarefa : tarefas) {
            if (tarefa != null) {
                System.out.println("Título: " + tarefa.getTitulo() + " | Descrição: " + tarefa.getDescricao() + " | Prioridade: " + tarefa.getPrioridade());
            }
        }
    }

}
