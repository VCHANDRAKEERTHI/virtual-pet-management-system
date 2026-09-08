package entity;

public class Rabbit extends Pet {

    public Rabbit(String nickname) {

        super(nickname);
    }

    @Override
    public String getPetType() {

        return "Rabbit";
    }

    @Override
    public void play() {

        if (getHealth() == 0) {

            System.out.println(
                    getNickname() +
                    " has 0% health."
            );

            System.out.println(
                    "Only Medicine is allowed."
            );

            return;
        }

        if (getEnergy() == 0) {

            System.out.println(
                    getNickname() +
                    " has 0% energy."
            );

            System.out.println(
                    "Cannot play."
            );

            return;
        }

        if (getHunger() == 0) {

            System.out.println(
                    getNickname() +
                    " is hungry."
            );

            System.out.println(
                    "Feed the pet before playing."
            );

            return;
        }

        setHunger(getHunger() + 15);
        setHappiness(getHappiness() + 20);
        setEnergy(getEnergy() - 20);
        setHealth(getHealth() - 5);

        System.out.println(
                getNickname() +
                " is jumping happily!"
        );
    }
}