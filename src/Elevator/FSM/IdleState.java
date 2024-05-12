package Elevator.FSM;

public class IdleState implements ElevatorFSM{
    public void update() {
        System.out.println("Elevator is idle");
    }
}
