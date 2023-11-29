/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author asus
 */
public class Animal {
    private String name;
    private boolean isVegetarian;
    private String food;
    private int numberOfLegs;
    private String color;

    public Animal(String name, boolean isVegetarian, String food, int numberOfLegs, String color) {
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.food = food;
        this.numberOfLegs = numberOfLegs;
        this.color = color;
    }

    public static void main(String[] args) {
        Animal peter = new Animal("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, his name is " + peter.name);
        System.out.println(peter.name + " is vegetarian? " + peter.isVegetarian);
        System.out.println(peter.name + " eats " + peter.food);
        System.out.println(peter.name + " has " + peter.numberOfLegs + " legs.");
        System.out.println(peter.name + " color is " + peter.color);
    }
}