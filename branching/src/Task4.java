/*
 Vending machine (Торговый автомат)
 */

import java.util.Scanner;

public class Task4 {

    enum Product {
        p1("Chokolate", 5, 20),
        p2("Ketchup", 2, 32),
        p3("Bread", 4, 2),
        p4("Tea", 5.4, 1),
        p5("Alkohol", 8.1, 22);

        private String name;
        private int amount;
        private double price;

        Product(String name, double price, int amount) {
            this.name = name;
            this.amount = amount;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public int getAmount() {
            return amount;
        }

        public void takeSome(int a) {
            this.amount -= a;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = 1;  // Счетчик для вывода номера товара
        String chosenProduct;

        while (true) {
            System.out.println("Введите товар:");
            chosenProduct = s.nextLine();



            switch (chosenProduct.toLowerCase()) {
                case "chokolate":
                    if (Product.p1.getAmount() > 0) {
                        System.out.println("Name: " + (x++) + " " + Product.p1.getName() + " | Price: " + Product.p1.getPrice());
                        Product.p1.takeSome(1);
                    } else {
                        System.out.println("Ошибка, недостаточно товара на складе!");
                    }
                    break;
                case "ketchup":
                    if (Product.p2.getAmount() > 0) {
                        System.out.println("Name: " + (x++) + " " + Product.p2.getName() + " | Price: " + Product.p2.getPrice());
                        Product.p2.takeSome(1);
                    } else {
                        System.out.println("Ошибка, недостаточно товара на складе!");
                    }
                    break;
                case "bread":
                    if (Product.p3.getAmount() > 0) {
                        System.out.println("Name: " + (x++) + " " + Product.p3.getName() + " | Price: " + Product.p3.getPrice());
                        Product.p3.takeSome(1);
                    } else {
                        System.out.println("Ошибка, недостаточно товара на складе!");
                    }
                    break;
                case "tea":
                    if (Product.p4.getAmount() > 0) {
                        System.out.println("Name: " + (x++) + " " + Product.p4.getName() + " | Price: " + Product.p4.getPrice());
                        Product.p4.takeSome(1);
                    } else {
                        System.out.println("Ошибка, недостаточно товара на складе!");
                    }
                    break;
                case "alkohol":
                    if (Product.p5.getAmount() > 0) {
                        System.out.println("Name: " + (x++) + " " + Product.p5.getName() + " | Price: " + Product.p5.getPrice());
                        Product.p5.takeSome(1);
                    } else {
                        System.out.println("Ошибка, недостаточно товара на складе!");
                    }
                    break;
                default:
                    System.out.println("Неизвестный товар: " + chosenProduct);
            }

                break;

        }


        System.out.println("Товары в наличии:");
        for (Product value : Product.values()) {
            System.out.println("Name: " + value.getName() + " | Amount: " + value.getAmount() + " | Price: " + value.getPrice());
        }

        s.close();
    }
}
