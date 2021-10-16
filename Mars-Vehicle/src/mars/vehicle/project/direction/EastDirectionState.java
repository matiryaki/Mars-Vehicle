package mars.vehicle.project.direction;

import mars.vehicle.project.models.Point;

public class EastDirectionState extends VehicleDirectionState {

	private Point coordinates;

	public EastDirectionState(Point coordinates) {
		super(coordinates);
		this.coordinates = coordinates;
	}

	@Override
	public void moveForward() {
		coordinates.setX(coordinates.getX() + 1);

	}

	@Override
	public VehicleDirectionState turnLeft() {

		return new NorthDirectionState(coordinates);
	}

	@Override
	public VehicleDirectionState turnRight() {

		return new SouthDirectionState(coordinates);
	}

	@Override
	public String toString() {

		return "E";
	}

}
