package mars.vehicle.project.direction;

import mars.vehicle.project.models.Point;

public abstract class VehicleDirectionState {

	private Point coordinates;

	public Point getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Point coordinates) {
		this.coordinates = coordinates;
	}

	public VehicleDirectionState(Point coordinates) {
		this.coordinates = coordinates;
	}

	public abstract void moveForward();

	public abstract VehicleDirectionState turnLeft();

	public abstract VehicleDirectionState turnRight();
}

