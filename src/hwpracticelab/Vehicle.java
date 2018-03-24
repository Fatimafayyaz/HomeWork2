package hwpracticelab;

public class Vehicle {
	//variables
	private int cSpeed=0, cDirection=100;
	private int vIdNumber=0;
	private String vOwner;
	//static variable
	private static int maxvId=0;
	//constructors
	 
	Vehicle()
	{ 
		this.vIdNumber=vIdNumber;}
	
	Vehicle(String owner)
	{ 
		this.vOwner=owner;   maxvId++;  }
	   
	//non-static methods
	void changeSpeed(int nSpeed)
	{
		cSpeed=nSpeed;
	}
	int getSpeed()
	{
		return cSpeed;
	}
	
		void ChangeDirection(int nDirection)
	{
		cDirection=nDirection;
	}
	int getDirection()
	{
		return cDirection;
	}
    void setOwner(String newOwner)
    {  vOwner=newOwner;
}
     String getOwner()
     {
    	 return vOwner;
     }
     //void setVin(int newVid) {vIdNumber=newVid ;}
     int getVin() {;return vIdNumber; }
     static int maxVidNumber( ) { return maxvId; }
}