
/**
 * @author (NP01CP4S220137 Pramit Badgami)
 * @version (1.0.0)
 */
public class AutoRickshaw extends Vehicle 
{
   //Attributes of Vehicle class
   private int engineDisplacement;
   private String torque;
   private int numberOfseats;
   private int fuelTankcapacity;
   private String groundClearance;
   private int chargeAmount;
   private String bookDate;
   private boolean isBooked;
   
   //Constructor
   public AutoRickshaw (int vehicleID,String vehicleName,String vehicleColor,String vehicleWeight ,String vehicleSpeed,int engineDispalcement,String torque
                        ,int fuelTankcapacity,String groundClearance)
   {
       
         //calling the constructor of Vehicle class               
         super(vehicleID, vehicleName, vehicleColor, vehicleWeight);
         //Initializing variables
         this.engineDisplacement = engineDispalcement;
         this.torque = torque;
         this.fuelTankcapacity = fuelTankcapacity;
         this.groundClearance= groundClearance;
         super.setvehicleSpeed(vehicleSpeed);
         super.setvehicleColor(vehicleColor);
         this.isBooked= false;
        }
   
   //creating getter method for each attributes
   public int getengineDispalcement()
   {
        return this.engineDisplacement;
   }
   
   public String gettorque()
   {
        return this.torque;
   }
   
   public int getnumberOfseats()
   {
        return this.numberOfseats;
   }
   
   public int getfuelTankcapacity()
   {
        return this.fuelTankcapacity;
   }
   
   public String getgroundClearance()
   {
        return this.groundClearance;
   }
   
   public int getchargeAmount()
   {
        return this.chargeAmount;
   }
   
   public String getbookDate()
   {
        return this.bookDate;
   }
   
   public boolean isBooked()
   {
        return this.isBooked;
   }
   
   //creating setter method to set the charge amount 
   public void setchargeAmount(int newChargeamount)
   {
        this.chargeAmount= newChargeamount;
   }
   ////creating setter method to set the number of seats
   public void setnumberOfseats(int newNumberOfseats)
   {
        this.numberOfseats= newNumberOfseats;
   }
    
   //method used to book
   public void book (String bookedDate,int Chargeamount, int numberofseats)
   {
       
        if (this.isBooked== false ){
            this.bookDate= bookedDate;
            System.out.println("Your autorickshaw"+ super.getvehicleID()+"is now booked");
            setchargeAmount(Chargeamount);
            setnumberOfseats(numberofseats);
            isBooked= true;
            System.out.println("your autorickshaw "+ super.getvehicleID()+"is already booked");
        }
        else{
            System.out.println("the status of isBooked is: " +isBooked);
            System.out.println("your autorickshaw "+ super.getvehicleID()+"is already booked");
        }
    }
    
   public void display()
   {   
       
        //calling display method from Vehilce class
        super.display();
        if (this.isBooked == true ){
            System.out.println("Engine Displacement:"+ this.engineDisplacement);
            System.out.println("Torque:"+this.torque);
            System.out.println("Fuel tank capacity: "+ this.fuelTankcapacity);
            System.out.println("Ground clearance:"+ this.groundClearance);
            System.out.println("Booked Date:"+ this.bookDate);
        }
        if (this.chargeAmount==0){
            System.out.println("Charge amount is not recorded");    
        }
        else{
            System.out.println("Charged amount:" + this.chargeAmount);
            }
        if (this.numberOfseats == 0){
            System.out.println("Number of seats are not recorded");
        }
        else{
            System.out.println("Number of seats:"+ this.numberOfseats);
        }
   } 
    
}