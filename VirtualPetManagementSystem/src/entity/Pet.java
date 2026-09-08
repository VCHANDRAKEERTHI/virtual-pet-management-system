package entity;

public abstract class Pet implements PetActions {

    private String nickname;

    private int hunger;
    private int happiness;
    private int energy;
    private int health;

    public Pet(String nickname) {

        this.nickname = nickname;

        hunger = 50;
        happiness = 50;
        energy = 50;
        health = 100;
    }

    // Getter for nickname

    public String getNickname() {
        return nickname;
    }

    // Getters for pet status

    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHealth() {
        return health;
    }

    // Setters

    protected void setHunger(int hunger) {
        this.hunger = limitValue(hunger);
    }

    protected void setHappiness(int happiness) {
        this.happiness = limitValue(happiness);
    }

    protected void setEnergy(int energy) {
        this.energy = limitValue(energy);
    }

    protected void setHealth(int health) {
        this.health = limitValue(health);
    }

    // Keeps every value between 0 and 100

    private int limitValue(int value) {

        if (value < 0) {
            return 0;
        }

        if (value > 100) {
            return 100;
        }

        return value;
    }

    // Feed

    @Override
    public void feed() {

        if (health == 0) {

            System.out.println(
                    nickname + " has 0% health."
            );

            System.out.println(
                    "Only Medicine is allowed."
            );

            return;
        }

        hunger = limitValue(hunger - 30);
        happiness = limitValue(happiness + 10);
        energy = limitValue(energy + 5);
        health = limitValue(health + 5);

        System.out.println(
                nickname + " has been fed."
        );
    }

    // Sleep

    @Override
    public void sleep() {

        if (health == 0) {

            System.out.println(
                    nickname + " has 0% health."
            );

            System.out.println(
                    "Only Medicine is allowed."
            );

            return;
        }

        energy = limitValue(energy + 30);
        happiness = limitValue(happiness + 5);
        health = limitValue(health + 5);

        System.out.println(
                nickname + " is sleeping."
        );
    }

    // Medicine

    @Override
    public void giveMedicine() {

        if (health == 100) {

            System.out.println(
                    nickname + " already has full health."
            );

            System.out.println(
                    "Medicine is not needed."
            );

            return;
        }

        health = limitValue(health + 25);
        happiness = limitValue(happiness - 5);
        energy = limitValue(energy - 5);

        System.out.println(
                nickname + " received medicine."
        );
    }

    // Play

    @Override
    public abstract void play();

  

    public abstract String getPetType();

   

    public void showStatus() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("              PET STATUS");
        System.out.println("========================================");

        System.out.println(
                "Nickname    : " + nickname
        );

        System.out.println(
                "Pet Type    : " + getPetType()
        );

        System.out.println(
                "Hunger      : " + hunger + "%"
        );

        System.out.println(
                "Happiness   : " + happiness + "%"
        );

        System.out.println(
                "Energy      : " + energy + "%"
        );

        System.out.println(
                "Health      : " + health + "%"
        );

        System.out.println("========================================");
    }
}