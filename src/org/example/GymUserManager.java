package org.example;

import java.util.ArrayList;

public class GymUserManager {
    private ArrayList<GymUser> users;

    public GymUserManager() {
        this.users = new ArrayList<>();
    }
    public  void addUser(GymUser user) {
        this.users.add(user);
    }
    public void displayAllUsersInfo()  {
        for (GymUser user : users) {
            System.out.println(user.toString());
        }
    }
    public void displayNameBmiAndObesity() {
        for (GymUser user : users) {
            System.out.println(user.getName() + "'s BMI is: " + user.calculateBMI());
            System.out.println(user.getName() + "'s obesity status is: " + user.getObesityStatus());
        }
    }
    public void displayUsersWithNonrHealtyObesityDegree() {
        for (GymUser user : users) {
            if (!user.getObesityStatus().equals("Healty")) {
                System.out.println(user.toString());
            }
        }
    }
    public String findTheUserByGivenName(String name) {
        for (GymUser user : users) {
            if (user.getName().equals(name)) {
                return user.toString();
            }
        }
        return "User not found!";
    }
    public void updateObesityThresholds(double underWeightThreshold, double overWeightThreshold) {
        GymUser.setUnderWeightThreshold(underWeightThreshold);
        GymUser.setOverWeightThreshold(overWeightThreshold);
    }


}
