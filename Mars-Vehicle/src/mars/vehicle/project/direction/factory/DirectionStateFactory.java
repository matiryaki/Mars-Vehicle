package mars.vehicle.project.direction.factory;

import mars.vehicle.project.direction.EastDirectionState;
import mars.vehicle.project.direction.NorthDirectionState;
import mars.vehicle.project.direction.SouthDirectionState;
import mars.vehicle.project.direction.VehicleDirectionState;
import mars.vehicle.project.direction.WestDirectionState;
import mars.vehicle.project.models.Point;

public class DirectionStateFactory {

	public static VehicleDirectionState Create(Point coordinates, String direction) {
		int x = coordinates.getX();
		int y = coordinates.getY();

		switch (direction) {
		case "N":
			return new NorthDirectionState(new Point(x, y));
		case "S":
			return new SouthDirectionState(new Point(x, y));
		case "E":
			return new EastDirectionState(new Point(x, y));
		case "W":
			return new WestDirectionState(new Point(x, y));
		default:
			return new EastDirectionState(new Point(x, y));
		}
	}
}
