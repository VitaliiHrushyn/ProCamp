import java.util.ArrayList;

interface AircraftComparator {
  
  private final static List<String> cargoPlaneTypeList = new ArrayList<>(Arrays.asList(
    "AntonovMriya", "AntonovRuslan", "AirbusBeluga", "Boeing Dreamlifter"));
  
  private final static List<String> passengerPlaneTypeList = new ArrayList<>(Arrays.asList(   
    "Boeing747", "AirbusA380", "Bombardier CRJ"));
}
