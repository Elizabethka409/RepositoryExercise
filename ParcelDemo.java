public class ParcelDemo
{
   int ID_number, zoning;
   double building_size, parcel_size, total_property_tax = 0;
   String address, zoningType;
   char loop;
   ArrayList<LandParcel> ParcelList = new ArrayList<LandParcel>();
   
   Scanner input = new Scanner(System.in);
   
   // creating loop to let user continue inputting information for more than one parcel
   // WIP
   do
   {
      
   
      System.out.print("\nWould you like to enter information for another parcel? (Y/N): ");
      loop = input.next().toUpperCase().charAt(0);
   
   } while (loop == 'Y');
}