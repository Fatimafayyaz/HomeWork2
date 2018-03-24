package hwpracticelab;

public class BoxCalculation {
	
	
	double per,vol,width,height,depth;
	private static int countVol=0,countPer=0;
	//constructor used when no dimensions specified
	BoxCalculation()
	 {
	        width=-1;
	        height=-1;
	        depth=-1;
	}	
 BoxCalculation(double w, double h, double d)
 {
        this.width=w;
        this.height=h;
        this.depth=d;
}
  //compute and return value
   public void calVolume()
 {
	 vol= width*height*depth;
	 countVol++;
 }
 public double returnVolume()
 { 
	 return vol;
 }
 public void calperimeter()
 {
	 per= width+height+depth;
	 countPer++;
 }
 public double getPerimeter()
  { return per;}
 
 public static int getTotalCalculation()
 { return countVol+countPer;}
 }
