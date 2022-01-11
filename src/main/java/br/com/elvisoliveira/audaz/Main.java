package br.com.elvisoliveira.audaz;

import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Fare fare = new Fare();
        fare.setId(UUID.randomUUID());

        System.out.println("Informe o valor da tarifa a ser cadastrada:");
        Scanner scanner = new Scanner(System.in);
        String fareValueInput = scanner.next();
        fare.setValue(Double.valueOf(fareValueInput));

        System.out.println("Informe o código da operadora para a tarifa:");
        System.out.println("Exemplos: OP01, OP02, OP03...");
        String operatorCodeInput = scanner.next();

        var fareController = new FareController();
        fareController.createFare(fare, operatorCodeInput);
    }
}
