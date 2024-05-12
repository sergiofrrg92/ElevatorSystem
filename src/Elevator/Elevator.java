package Elevator;

import Elevator.FSM.ElevatorFSM;

public abstract class Elevator {
    int maxLoad;
    int currentLoad;
    Door door;
    Floor currentFloor;
    ElevatorFSM fsm;

    public void update() {
        fsm.update();
    }
}
