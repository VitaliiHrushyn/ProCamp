
public abstract class Aircraft implements Comparable<Aircraft> {  
    
  	private static int nextId = 0;
  	private final int id;
  
    private String brand;
  	private String name;
  	private int totalCapacity; // kg
    private int carryingCapacity;  // cubic meters
    private int flightRange; // long of flight
    private int fuelConsumption; // liters per hour
//  	private int speed; // km per hour
  
  	public Aircraft() {
      id = ++nextId;
    }
  
  	public int getFuelConsumption() {
      return fuelConsumption;
    }
  
    public int getTotalCapacity() {
      return totalCapacity;
    }
  
  	public int getCarryingCapacity() {
      return carryingCapacity;
    }
  
  	public int getFlightRange() {
      return flightRange;
    }
  
  @Override
  public int compareTo(Aircraft plane) {
   return (int) flightRange.compareTo(plane.getFlightRange());
  }
  
}
