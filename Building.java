public class Building
{
   private String address;
   private double building_size; // measures in square feet
   
   // no-arg constructor
   public Building()
   {
      address = "";
      building_size = 0.0;
   }
   
   // constructor that accepts all args
   public Building(String address, double building_size)
   {
      this.address = address;
      this.building_size = building_size;
   }
   
   // copy constructor
   public Building(Building bd)
   {
      address = bd.getAddress();
      building_size = bd.getBuildingSize();
   }
   
   // getter methods
   public String getAddress()
   {
      return address;
   }
   
   public double getBuildingSize()
   {
      return building_size;
   }
   
   // setter methods
   public void setAddress(String a)
   {
      address = a;
   }
   
   public void setBuildingSize(double bs)
   {
      building_size = bs;
   }
   
   // @ return A string that describes the Building
   public String toString()
   {
      return String.format("Buidling Address: " + address +
                           "/nBuilding Size: %,.2f square feet", building_size);
   }
}