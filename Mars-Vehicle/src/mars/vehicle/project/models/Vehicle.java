package mars.vehicle.project.models;

import mars.vehicle.project.direction.VehicleDirectionState;
import mars.vehicle.project.direction.factory.DirectionStateFactory;

public class Vehicle {

	private VehicleDirectionState vehicleState;

	public Vehicle(Point coordinates, String direction) {
		this.vehicleState = DirectionStateFactory.Create(coordinates, direction);
	}

	public void moveForward() {
		this.vehicleState.moveForward();
	}

	public void turnLeft() {
		this.vehicleState = this.vehicleState.turnLeft();
	}

	public void turnRight() {
		this.vehicleState = this.vehicleState.turnRight();
	}

	public Point getCoordinates() {
		return this.vehicleState.getCoordinates();
	}

	@Override
	public String toString() {

		return this.getCoordinates() + " " + this.vehicleState;

	}
}
