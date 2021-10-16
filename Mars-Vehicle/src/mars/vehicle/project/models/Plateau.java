package mars.vehicle.project.models;

public class Plateau {

	private int xLimit;
	private int yLimit;
	public Vehicle vehicle;

	public Plateau(String xyLimit) {
		findXYLimits(xyLimit);

	}

	private void findXYLimits(String xyLimit) {
		String[] xyLimits = xyLimit.split(" ");
		this.xLimit = Integer.parseInt(xyLimits[0]);
		this.yLimit = Integer.parseInt(xyLimits[1]);
	}

	public void locateVehicle(Vehicle vehicle) {
		if (vehicle.getCoordinates().getX() > this.xLimit)
			throw new IllegalArgumentException("You can not assign over limits locate value.");
		if (vehicle.getCoordinates().getY() > this.yLimit)
			throw new IllegalArgumentException("You can not assign over limits locate value.");

		this.vehicle = vehicle;
	}

	public void moveVehicle(String command) {
		switch (command) {
		case "M":
			vehicle.moveForward();

			if (!(vehicle.getCoordinates().getX() <= this.xLimit & vehicle.getCoordinates().getY() <= this.yLimit))
				throw new IllegalArgumentException("You passed the plateau limits.");

			break;
		case "L":
			vehicle.turnLeft();
			break;
		case "R":
			vehicle.turnRight();
			break;
		}
	}
}
