package mars.vehicle.project.direction;

import mars.vehicle.project.models.Point;

public class NorthDirectionState extends VehicleDirectionState {

	private Point coordinates;

	public NorthDirectionState(Point coordinates) {

		super(coordinates);
		this.coordinates = coordinates;

	}

	@Override
	public void moveForward() {

		coordinates.setY(coordinates.getY() + 1);
	}

	@Override
	public VehicleDirectionState turnLeft() {

		return new WestDirectionState(coordinates);
	}

	@Override
	public VehicleDirectionState turnRight() {

		return new EastDirectionState(coordinates);
	}

	@Override
	public String toString() {

		return "N";
	}

}
