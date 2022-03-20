package com.bits.squad.c2;

import com.bits.squad.c2.classes.ex1.Square;
import com.bits.squad.c2.classes.ex2.Animal;
import com.bits.squad.c2.classes.ex3.Amphibious;
import com.bits.squad.c2.classes.ex3.Auto;
import com.bits.squad.c2.classes.ex3.Boat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class c2 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------Ex1---------------------------------------");
        Square square1 = new Square(5);
        Square square2 = new Square(7);
        Square square3 = new Square(6);
        Square square4 = new Square(3);
        Square square5 = new Square(9);
        ArrayList<Square> squares = new ArrayList<>(
                Arrays.asList(square1, square2, square3, square4, square5)
        );
        System.out.println(squares);
        Collections.sort(squares);
        System.out.println(squares);
        System.out.println("---------------------------------------Ex2---------------------------------------");
        Animal animal = new Animal("Elephant");
        animal.move();
        animal.speak();
        System.out.println("---------------------------------------Ex3---------------------------------------");
        Auto auto = new Auto("BMW");
        Boat boat = new Boat("Shark");
        Amphibious amphibious = new Amphibious("Crocodile");
        auto.move();
        boat.move();
        amphibious.move();
    }
}
