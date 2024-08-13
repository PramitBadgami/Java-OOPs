
/**
 * @author (NP01CP4S220137 Pramit Badgami)
 * @version (1.0.0)
 */
public class Vehicle
{
    //Attributes of Vehicle class
    private int vehicleID;
    private String vehicleName;
    private String vehicleColor;
    private String vehicleSpeed;
    private String vehicleWeight;
    
    //Constructor 
    public Vehicle (int vehicleID, String vehicleName, String vehicleColor, String vehicleWeight )
    { 
        
        //Initializing variables
        this.vehicleID = vehicleID; //values are signed in variable 
        this.vehicleName= vehicleName;
        this.vehicleColor= vehicleColor;
        this.vehicleWeight= vehicleWeight;
    }
    
    //creating getter method for each attributes
    public int getvehicleID()//getter method
    { 
        return this.vehicleID;
    }
    
    public String getvehicleName()
    {
        return this.vehicleName;
    }
    
    public String getvehicleColor()
    {
        return this.vehicleColor;
    }
    
    public String getvehicleSpeed()
    {
        return this.vehicleSpeed;
    }
    
    public String getvehicleWeight()
    {
        return this.vehicleWeight;
    }
    
    //creating setter method to set the vehicle speed
    public void setvehicleSpeed(String newSpeed)//setter method
    { 
        this.vehicleSpeed = newSpeed;
    }
    
    //creating setter method to set the vehicle color
    public void setvehicleColor(String newColor)
    {
        this.vehicleColor = newColor;
    }
    
    //creating display method
    public void display()
    { 
        
        System.out.println("Vehicle ID: " + this.vehicleID); 
        System.out.println("Vehicle Name: " + this.vehicleName);
        System.out.println("Vehicle Color: " + this.vehicleColor);
        System.out.println("Vehicle Speed: " + this.vehicleSpeed);
        
        //Whether vehile weight is empty or not
        if(vehicleWeight == null || vehicleWeight == ""|| vehicleWeight == "0") {
            System.out.println("Vehicle weight is empty");
        }
        else {
            System.out.println("Vehicle Weight: " + this.vehicleWeight);
        }
    }
}