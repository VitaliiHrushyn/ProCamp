import java.util.*;

class AirlineCompany {
  
  private Set<Aircraft> planes = new TreeSet<>();
  
  public void setPlanes(Set<Aircraft> planes) {
    this.planes = planes;
  }
  
  public void addPlane(Aircraft plane) {
    planes.add(plane);
  }
  
  public Set<Aircraft> findPlaneOfFuelConsumption(int min, int max) {
    Set<Aircraft> resultSet = new TreeSet<>();
    for (Aircraft plane : planes) {
      if (plane.getFuelConsumption() >= min && plane.getFuelConsumption() <= max) {
        resultSet.add(plane);
      }
    }
    return resultSet;
  }
  
  public int showTotalCapacity() {
    int airlineTotalCapacity = 0;
    for (Aircraft plane : planes) {
      airlineTotalCapacity += plane.getTotalCapacity();
    }
    return airlineTotalCapacity;
  }
  
  public int showCarryingCapacity() {
    int airlineCarryingCapacity = 0;
    for (Aircraft plane : planes) {
      airlineCarryingCapacity += plane.getCarryingCapacity();
    }
    return airlineCarryingCapacity;
  }
  
  public Set getPlanes() {
    return planes;
  }
  
}
