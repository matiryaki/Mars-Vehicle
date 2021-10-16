package mars.vehicle.project.models;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x > -1)
			this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y > -1)
			this.y = y;
	}

	@Override
	public String toString() {

		return this.x + " " + this.y;
	}

}
