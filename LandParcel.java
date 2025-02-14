public class LandParcel
{
   private int id_number;
   private double parcel_size; // measures in acres
   private String zoning_type;
   private Building building;
   
   // no-arg constructor
   public LandParcel()
   {
      id_number = 0;
      parcel_size = 0.0;
      zone = "";
      building = new Building();
   }
   
   /**
   Constructor that accepts arguments.
   @param id The ID Number
   @param size The parcel size
   @param zone The zoning type of the parcel
   @param bd The building associated with the parcel
   */   
   public LandParcel(int id, double size, String zone, Building bd)
   {
      id_number = id;
      parcel_size = size;
      zoning_type = zone;
      building = new Building(bd);
   }
   
   // getter methods
   public int getID()
   {
      return id;
   }
   
   public double getParcelSize()
   {
      return size;
   }
   
   public String getZoneType()
   {
      return zone;
   }
   
   // @return copy of Building object and sending copy to other class
   public Building getBuilding()
   {
      return new Building(building);
   }
   
   // setter methods
   public void setID(int id)
   {
      id_number = id;
   }
   
   public void setParcelSize(double size)
   {
      parcel_size = size;
   }
   
   public void setZoneType(String zone)
   {
      zoning_type = zone;
   }
   
   public void setBuilding(Building bd)
   {
      building = new Building(bd); // creates a copy
   }
   
   // method to calculate the property tax of building and parcel
   // WIP
   public double calcPropertyTax()
   {
      
   } 
   
   // @ return A string that describes the Parcel
   // WIP
   public String toString()
   {
      return String.format("Parcel ID number: " + id +
                           "/nParcel Size: " + parcel_size
                           );
   }
}