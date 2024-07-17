public class Forests {

  public static void main(String[] args) {
      System.out.println("Welcome to CodeQuest!");
      System.out.println("Your objective: Help the villagers restore power to their homes.");

      // Challenge 1: Turning on Lights
      System.out.println("\nChallenge 1: Turning on Lights");
      turningOnLights();

      // Challenge 2: Tracking Energy Levels
      System.out.println("\nChallenge 2: Tracking Energy Levels");
      trackingEnergyLevels();

      // Challenge 3: Efficient Power Usage
      System.out.println("\nChallenge 3: Efficient Power Usage");
      efficientPowerUsage();

      System.out.println("\nCongratulations! You've completed Level 1: The Mysterious Forest.");
  }

  // Method for Challenge 1: Turning on Lights
  public static void turningOnLights() {
      // Variables to track the status of each light
      boolean light1 = false;
      boolean light2 = false;
      boolean light3 = false;

      // Turn on the lights in sequence
      light1 = true;
      System.out.println("Light 1 is now ON.");

      light2 = true;
      System.out.println("Light 2 is now ON.");

      light3 = true;
      System.out.println("Light 3 is now ON.");

      // Display the final status of all lights
      System.out.println("All lights are now ON.");
  }

  // Method for Challenge 2: Tracking Energy Levels
  public static void trackingEnergyLevels() {
      // Variables to track energy levels
      int energyLight1 = 10; // Energy needed for light 1
      int energyLight2 = 15; // Energy needed for light 2
      int energyLight3 = 20; // Energy needed for light 3

      // Calculate total energy required
      int totalEnergy = energyLight1 + energyLight2 + energyLight3;

      // Display energy levels for each light
      System.out.println("Energy needed for Light 1: " + energyLight1 + " units");
      System.out.println("Energy needed for Light 2: " + energyLight2 + " units");
      System.out.println("Energy needed for Light 3: " + energyLight3 + " units");

      // Display total energy required
      System.out.println("Total energy needed: " + totalEnergy + " units");
  }

  // Method for Challenge 3: Efficient Power Usage
  public static void efficientPowerUsage() {
      // Variables to track energy levels
      int energyLight1 = 10; // Energy needed for light 1
      int energyLight2 = 15; // Energy needed for light 2
      int energyLight3 = 20; // Energy needed for light 3
      int energyLimit = 40; // Maximum energy limit

      // Calculate total energy required
      int totalEnergy = energyLight1 + energyLight2 + energyLight3;

      // Check if the total energy exceeds the limit
      if (totalEnergy <= energyLimit) {
          // Turn on the lights if within the limit
          System.out.println("Turning on all lights.");
          System.out.println("Total energy used: " + totalEnergy + " units");
      } else {
          // Display a message if the energy exceeds the limit
          System.out.println("Energy limit exceeded! Cannot turn on all lights.");
      }
  }
}
