package org.example;

public class GymUser {

    private static final String DEFNAAM = "Just_a_user";
    private static final String UNASSIGNED_GENDER = "Female";
    private static final int INL_AGE = 18;
    private static final double INL_HEIGHT = 1.70;
    private static final double INL_WEIGHT = 50;

    //not sure these as static needed?
    private static double UNDERWEIGHT_THRESHOLD = 18.0;
    private static double NORMAL_THRESHOLD = 25.0;

    private String name;
    private String gender;
    private int age;
    private double height;
    private double weight;
    private static int instanceCount = 0;

    public GymUser() {
        this.name = DEFNAAM;
        this.gender = UNASSIGNED_GENDER;
        this.age = INL_AGE;
        this.height = INL_HEIGHT;
        this.weight = INL_WEIGHT;
        instanceCount++;

    }

    public GymUser(String name, int age) {
        this.name = name;
        this.gender = UNASSIGNED_GENDER;
        this.age = age;
        this.height = INL_HEIGHT;
        this.weight = INL_WEIGHT;
        instanceCount++;

    }

    public GymUser(String name, String gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        instanceCount++;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "GymUser Info: \n\n" +
                "Name: " + name +
                ", Gender: " + gender +
                ", Age: " + age +
                ", Height: " + height + " meters" +
                ", Weight: " + weight + " kg";
    }

    public int compareAge(GymUser otherUser) {
        return this.age - otherUser.getAge();
    }

    public double calculateBMI() {
        return weight / (height * height);
    }
    public static void setUnderWeightThreshold(double threshold) {
        UNDERWEIGHT_THRESHOLD = threshold;
    }

    public static void setOverWeightThreshold(double threshold) {
        NORMAL_THRESHOLD = threshold;
    }

    public String getObesityStatus() {
        double bmiDegree = calculateBMI();
        if (bmiDegree < 18) {
            return "Underweight";
        } else if (bmiDegree < 25) {
            return "Healty";
        }  else {
            return "Obese";
        }
    }
    public GymUser findYoungestOneWithGivenUser(GymUser otherUser) {
        if (this.age < otherUser.getAge()) {
            return this;
        } else {
            return otherUser;
        }
    }

    public void changeUserAgeWithAnotherOne(GymUser User1, GymUser User2) {
        User1.setAge(User2.getAge());
    }
    public  void findYoungestOneBetween2(GymUser User1, GymUser User2) {
        if (User1.getAge() < User2.getAge()) {
            System.out.println(User1.getName() + " is younger than " + User2.getName());
        } else {
            System.out.println(User2.getName() + " is younger than " + User1.getName());
        }
    }
}
