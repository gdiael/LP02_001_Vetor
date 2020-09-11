
public class Vetor {
	
	public double x;
	public double y;
	public double z;
	
	public Vetor(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void add(Vetor v){
		this.x += v.x;
		this.y += v.y;
		this.z += v.z;
	}
	
	public double norm(){
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	public void unit(){
		double n = this.norm();
		x = x / n;
		y = y / n;
		z = z / n;
	}
	
	public static void main(String [] args){
		Vetor u = new Vetor(0.1, 0.4, 1);
		Vetor v = new Vetor(1,0,0);
		
		u.add(v);
		System.out.println(u.x + " " + u.y + " " + u.z);
		System.out.println(v.x + " " + v.y + " " + v.z);
	}
}
