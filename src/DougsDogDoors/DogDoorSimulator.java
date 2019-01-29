package DougsDogDoors;

public class DogDoorSimulator {

    public static void main(String[] args){
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...");
        remote.presButton();
        System.out.println("\nFido has gone outside...");
        System.out.println("\n Fido's all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e){

        }

        System.out.println("...but he's stuck outside");
        System.out.println("\nFido starts barking...");
        System.out.println("...so Gina brans the remote control");
        remote.presButton();

        System.out.println("\nFido's back inside...");
    }
}
