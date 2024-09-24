package org.example;

public class Main {
    public static void main(String[] args) {
        GymUserManager manager = new GymUserManager();

        GymUser user1 = new GymUser("Tolga", "Male", 25, 1.78, 85);
        GymUser user2 = new GymUser("Selin", "Female", 30, 1.65, 55);
        GymUser user3 = new GymUser("Alex", "Male", 40, 1.90, 100);

        manager.addUser(user1);
        manager.addUser(user2);
        manager.addUser(user3);

        System.out.println("Users' BMI and Obesity Status (Before):");
        manager.displayNameBmiAndObesity();

        System.out.println("\nUpdating Obesity Thresholds...");
        manager.updateObesityThresholds(19.0, 26.0);

        System.out.println("\nUsers' BMI and Obesity Status (After):");
        manager.displayNameBmiAndObesity();
    }
}
