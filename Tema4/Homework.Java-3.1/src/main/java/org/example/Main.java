package org.example;
public class Main {
    public static void main(String[] args)
    {
        // Exemplu 1: o soluție
        Ecuat_grad_1 ecuatie1 = new Ecuat_grad_1(2, -4);
        ecuatie1.salveazaInJson("solutie1.json");

        // Exemplu 2: ecuație fără soluție
        Ecuat_grad_1 ecuatie2 = new Ecuat_grad_1(0, 3);
        ecuatie2.salveazaInJson("solutie2.json");

        // Exemplu 3: ecuație cu infinit de soluții
        Ecuat_grad_1 ecuatie3 = new Ecuat_grad_1(0, 0);
        ecuatie3.salveazaInJson("solutie3.json");
    }
}