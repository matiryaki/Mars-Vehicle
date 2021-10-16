package mars.vehicle.project.facade;

import mars.vehicle.project.models.Plateau;
import mars.vehicle.project.models.Point;
import mars.vehicle.project.models.Vehicle;

public class VehicleFunctionFacade {

	Plateau plateau;

	public void createPlateau(String plateauLimit) {
		Plateau plateau = new Plateau(plateauLimit);
		this.plateau = plateau;
	}

	public void specifyLocation(String location) {

		String[] locationList = location.split(" ");
		plateau.locateVehicle(new Vehicle(
				new Point(Integer.parseInt(locationList[0]), Integer.parseInt(locationList[1])), locationList[2]));

	}

	public void move(String route) {

		for (char ch : route.toCharArray()) {

			plateau.moveVehicle(String.valueOf(ch));

		}

		System.out.println("Current location of the vehicle:");
		System.out.println(plateau.vehicle);
		System.out.println("***********************************");
	}
}
