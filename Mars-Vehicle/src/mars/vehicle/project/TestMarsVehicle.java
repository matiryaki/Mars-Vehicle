package mars.vehicle.project;

import java.util.Scanner;

import mars.vehicle.project.facade.VehicleFunctionFacade;

public class TestMarsVehicle {

	public static void main(String[] args) {

		VehicleFunctionFacade vehicle = new VehicleFunctionFacade();

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the plateau limits:");
		String plateauLimit = in.nextLine();
		vehicle.createPlateau(plateauLimit);

		System.out.println("Please enter first vehicle the location:");
		String location = in.nextLine();
		vehicle.specifyLocation(location);

		System.out.println("Please enter first vehicle the route:");
		String route = in.nextLine();
		vehicle.move(route);

		System.out.println("Please enter second vehicle the location:");
		String secondLocation = in.nextLine();
		vehicle.specifyLocation(secondLocation);

		System.out.println("Please enter second vehicle the route:");
		String seconRroute = in.nextLine();
		vehicle.move(seconRroute);
		in.close();
	}
}
