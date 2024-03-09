package org.example;

import org.example.Animal;
import org.example.SistemaVeterinario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaVeterinario sistema = new SistemaVeterinario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar animal");
            System.out.println("2. Buscar animal");
            System.out.println("3. Alterar animal");
            System.out.println("4. Excluir animal");
            System.out.println("5. Listar animais");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do animal: ");
                    int id = scanner.nextInt();
                    System.out.print("Digite o nome do animal: ");
                    String nome = scanner.next();
                    sistema.cadastrarAnimal(id, nome);
                    break;
                case 2:
                    System.out.print("Digite o ID do animal: ");
                    id = scanner.nextInt();
                    Animal animal = sistema.buscarAnimal(id);
                    if (animal != null) {
                        System.out.println("Animal encontrado: " + animal.getNome());
                    } else {
                        System.out.println("Animal não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o ID do animal: ");
                    id = scanner.nextInt();
                    System.out.print("Digite o novo nome do animal: ");
                    nome = scanner.next();
                    sistema.alterarAnimal(id, nome);
                    break;
                case 4:
                    System.out.print("Digite o ID do animal: ");
                    id = scanner.nextInt();
                    sistema.excluirAnimal(id);
                    break;
                case 5:
                    System.out.println("Animais cadastrados:");
                    for (Animal a : sistema.listarAnimais()) {
                        System.out.println("ID: " + a.getId() + ", Nome: " + a.getNome());
                    }
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}