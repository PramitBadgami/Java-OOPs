
/**
 * @author (NP01CP4S220137 Pramit Badgami)
 * @version (1.0.0)
 */
public class ElectricScooter extends Vehicle 
{
    //Attributes of ElectricScooter class
    private int range;
    private int batteryCapacity;
    private int price;
    private String ChargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    
    //Constructor of Electricscooter class
    public ElectricScooter(int vehicleID,String vehicleName,String vehicleWeight, String vehicleSpeed, String vehicleColor,int batteryCapacity )
    {
        
        //calling the constructor of Vehicle class
        super(vehicleID,vehicleName,vehicleColor,vehicleWeight);
        this.range = 0;
        this.price = 0;
        this.brand = "";
        this.mileage = "";
        this.ChargingTime ="";
        this.batteryCapacity = batteryCapacity;
        this.hasPurchased = false;
        this.hasSold = false ;
        super.setvehicleSpeed(vehicleSpeed);//calling setvehicleSpeed method from Vehicle class
        super.setvehicleColor(vehicleColor);//calling setvehicleColor method from Vehicle class 
    }
    
    //creating getter method for each attributes
    public int getrange ()
    {
        return this.range;
    }
    
    public int getbatteryCapacity()
    {
        return this.batteryCapacity;
    }
    
    public int getprice ()
    {
        return this.price;
    }
    
    public String getChargingTime()
    {
        return this.ChargingTime;
    }
    
    public String getbrand()
    {
        return this.brand;
    }
    
    public String getmileage()
    {
        return this.mileage;
    }
    
    public boolean gethasPurchased()
    {
        return this.hasPurchased;
    }
    
    public boolean gethasSold()
    {
        return this.hasSold;
    }
    
    //creating setter method to set the brand    
    public void setBrand(String newBrand)
    {
        
        if(this.hasPurchased == false){
             this.brand= newBrand;
        }
        else{
             System.out.println("Brand cannot be changed");
        }   
    }
    
    //method used to purchase
    public void purchase(String newBrand,int newPrice,String newChargingTime, String newMileage, int newRange)
    {
        
        if (this.hasPurchased == false){
             setBrand(newBrand);
             this.price=newPrice;
             this.ChargingTime= newChargingTime;
             this.mileage=newMileage;
             this.range=newRange;
             this.hasPurchased = true;
        }
        else{
            System.out.println("has already been purchased");
        }
    }
    
    //method used to sell
    public void sell(int newPrice)
    {
        
        if (this.hasSold == false){
            this.price = newPrice;
            this.range = (0);
            this.ChargingTime = ("");
            this.mileage=("");
            this.batteryCapacity=(0);
            this.hasSold = (true);
            this.hasPurchased = (false);
        }
        else{
        System.out.println("The scooter is already purchased");
        }
    }
       
    //creating display method
    public void display()
    {
        
        //calling display method from Vehilce class
        super.display();
        if (this.hasPurchased == true){
            System.out.println("Brand:"+this.brand);
            System.out.println("Battery Capacity:"+this.batteryCapacity);
            System.out.println("Mileage:"+this.mileage);
            System.out.println("Range"+this.range);
            System.out.println("Recharge time:"+this.ChargingTime); 
        }
    }
}
