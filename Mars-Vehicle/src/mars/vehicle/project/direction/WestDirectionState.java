package mars.vehicle.project.direction;

import mars.vehicle.project.models.Point;


public class WestDirectionState extends VehicleDirectionState {

	private Point coordinates;

	public WestDirectionState(Point coordinates) {

		super(coordinates);
		this.coordinates = coordinates;
	}

	@Override
	public void moveForward() {

		coordinates.setX(coordinates.getX() - 1);

	}

	@Override
	public VehicleDirectionState turnLeft() {

		return new SouthDirectionState(coordinates);
	}

	@Override
	public VehicleDirectionState turnRight() {

		return new NorthDirectionState(coordinates);
	}

	@Override
	public String toString() {

		return "W";
	}

}
