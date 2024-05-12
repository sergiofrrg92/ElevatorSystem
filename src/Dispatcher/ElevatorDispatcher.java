package Dispatcher;

import Elevator.Elevator;

import java.util.List;
import java.util.Queue;

public abstract class ElevatorDispatcher {
    private List<Elevator> elevators;
    // Potentially a min-heap to prioritize best elevator
    private List<Elevator> availableElevators;
    // Queue requests

    public ElevatorDispatcher(List<Elevator> elevators) {
        this.elevators = elevators;
        this.availableElevators = elevators;
    }

    public abstract void dispatch();
}
