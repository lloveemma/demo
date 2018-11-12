package com.emma.week8;

import java.util.Scanner;

public class TrailerRentSystem {
    private int[] largeTrailers = { 1, 2, 3 };
    private String[] large_renter_names = new String[largeTrailers.length];
    private int large_weight = 3000;
    boolean[] large_rental_flags = { true, true, true };

    private int[] smallTrailers = { 1, 2, 3, 4, 5 };
    private String[] small_renter_names = new String[smallTrailers.length];
    private int small_weight = 750;
    boolean[] small_rental_flags = { true, true, true, true, true };

    private Scanner scanner;
    private int selectMenu = -1;

    public static void main(String[] args) {
        new TrailerRentSystem().run();
    }

    public void run() {
        while (selectMenu != 9) {
            showMenu();
            scanner = new Scanner(System.in);
            selectMenu = scanner.nextInt();
            if (selectMenu == 1) {
                rental(1);
            } else if (selectMenu == 2) {
                rental(2);
            } else if (selectMenu == 3) {
                overview();
            } else if (selectMenu == 9) {
                break;
            } else {
                System.out.println("Invalid input, try again!");
            }
        }
    }

    private void overview() {
        System.out.println("Rented small trailers:");
        int small_count = 0;
        for (int i = 0; i < small_rental_flags.length; i++) {
            if (!small_rental_flags[i]) {
                System.out.println("  Small trailer " + smallTrailers[i] + ": " + small_renter_names[i]);
                small_count++;
            }
        }
        if (small_count == 0) {
            System.out.println("  No rental records.");
        }
        int small_left = smallTrailers.length - small_count;
        System.out.println(
                "There are " + small_left + " out of " + smallTrailers.length + " small trailers still available. ");

        System.out.println("Rented large trailers:");
        int large_count = 0;
        for (int i = 0; i < large_rental_flags.length; i++) {
            if (!large_rental_flags[i]) {
                System.out.println("  Large trailer " + largeTrailers[i] + ": " + large_renter_names[i]);
                large_count++;
            }
        }
        if (large_count == 0) {
            System.out.println("  No rental records.");
        }
        int large_left = largeTrailers.length - large_count;
        System.out.println(
                "There are " + large_left + " out of " + largeTrailers.length + " large trailers still available. ");
    }

    /**
     * rent a trailer
     * 
     * @param type
     *            1: small, 2: large
     */
    private void rental(int type) {
        boolean keyizu = checkAvailable(type); // 可以租
        if (keyizu) {
            String[] names = type == 1 ? small_renter_names : large_renter_names;
            boolean[] flags = type == 1 ? small_rental_flags : large_rental_flags;
            int weight = type == 1 ? small_weight : large_weight;

            System.out.print("What is the last name of the customer?");
            String name = getStringInput();
            if (type == 2) {
                System.out.println("Is the driver in possession of an E-type drivers license (y/n)? ");
                String yorn = getChooseInput();
                if ("n".equals(yorn)) {
                    System.out.println(
                            "Unfortunately, a large trailer cannot be rented without a E-type drivers license. ");
                }
            }
            System.out.print("What is the weight of the load (in kg)?");
            scanner = new Scanner(System.in);
            double input_weight = scanner.nextDouble();
            if (input_weight > weight) {
                double exceed = input_weight - weight;
                System.out.println("Warning! The maximum load (" + weight + " kg) is exceeded by " + exceed + " kg! ");
            }
            System.out.print("Are you sure you want to rent the trailer (y/n)? ");
            String yorn = getChooseInput();
            if ("y".equals(yorn)) {
                for (int i = 0; i < flags.length; i++) {
                    if (flags[i]) {
                        flags[i] = false;
                        names[i] = name;
                        break;
                    }
                }
            }
        } else {// 不可以租
            if (type == 1) {
                System.out.println("Unfortunately, there are no small trailers available!");
            } else {
                System.out.println("Unfortunately, all large trailers are out!. ");
                System.out.print("Would you like to rent a small trailer instead (y/n)? ");
                String yorn = getChooseInput();
                if ("y".equals(yorn)) {
                    rental(1);
                }
            }
        }

    }

    /**
     * get choose input
     * 
     * @return "y" or "n"
     */
    private String getChooseInput() {
        while (true) {
            String yorn = getStringInput();
            if ("y".equals(yorn) || "n".equals(yorn)) {
                return yorn;
            } else {
                System.out.print("Only y or n is accepted, try again (y/n):");
            }
        }
    }

    /**
     * get user input
     * 
     * @return input string
     */
    private String getStringInput() {
        scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    /**
     * @param type
     *            1: small, 2: large
     * @return boolean available
     */
    private boolean checkAvailable(int type) {
        // 1 small, 2 large
        boolean[] flags = type == 1 ? small_rental_flags : large_rental_flags;
        for (boolean available : flags) {
            if (available) {
                return true;
            }
        }
        return false;
    }

    private void showMenu() {
        System.out.println("****************************************** ");
        System.out.println("* Trailer rental ");
        System.out.println("****************************************** ");
        System.out.println("* 1) Rent small trailer ");
        System.out.println("* 2) Rent large trailer ");
        System.out.println("* 3) Overview ");
        System.out.println("* 9) Exit ");
        System.out.println("****************************************** ");
        System.out.print("Select an option: ");
    }
}
