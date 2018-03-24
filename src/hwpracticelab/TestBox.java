package hwpracticelab;

public class TestBox {

	public static void main(String[] args) {
		// This class declares object of type BoxCalculate class
		
		BoxCalculation mybox1 = new BoxCalculation();
		BoxCalculation mybox2 = new BoxCalculation(10,20,5);
		//double vol;   
		//declare variable to calculate volume
      	//get volume of first box
		
		mybox1.calVolume();
		System.out.println("box1 volume is:-  " + mybox1.returnVolume());
		System.out.println("total calculations are " + BoxCalculation.getTotalCalculation());
		//get volume of second box
		mybox2.calVolume();
	    //System.out.println("volume of mybox2 is: " + vol);
		System.out.println("box2 volume is:-  " + mybox2.returnVolume());
		 mybox1.calperimeter();
		 System.out.println("box1 perimeter is:-  " + mybox1.getPerimeter());
		 System.out.println("total calculations are " + BoxCalculation.getTotalCalculation());	
		 mybox2.calperimeter();
		 System.out.println("box2 perimeter is:-  " + mybox2.getPerimeter());
		 System.out.println("total calculations are " + BoxCalculation.getTotalCalculation());
	}

}
