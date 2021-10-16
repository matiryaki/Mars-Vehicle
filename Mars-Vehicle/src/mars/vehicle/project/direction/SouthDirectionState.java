package mars.vehicle.project.direction;

import mars.vehicle.project.models.Point;

public class SouthDirectionState extends VehicleDirectionState {

	private Point coordinates;

	public SouthDirectionState(Point coordinates) {
		super(coordinates);
		this.coordinates = coordinates;
	}

	@Override
	public void moveForward() {

		coordinates.setY(coordinates.getY() - 1);

	}

	@Override
	public VehicleDirectionState turnLeft() {

		return new EastDirectionState(coordinates);
	}

	@Override
	public VehicleDirectionState turnRight() {

		return new WestDirectionState(coordinates);
	}

	@Override
	public String toString() {

		return "S";

	}

}
