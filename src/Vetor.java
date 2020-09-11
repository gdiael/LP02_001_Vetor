
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
	
	public void subt(Vetor v){
		this.x -= v.x;
		this.y -= v.y;
		this.z -= v.z;
	}

	public void invert(){
		this.x = -this.x;
		this.y = -this.y;
		this.z = -this.z;
	}

	public void multiply(double k){
		this.x = this.x*k;
		this.y = this.y*k;
		this.z = this.z*k;
	}

	public double dotProduct(Vetor v){
		return this.x * v.x + this.y * v.y + this.z * v.z;
	}

	public Vetor crossProduct(Vetor v){
		double crossX = this.y * v.z - this.z * v.x;
		double crossY = this.z * v.x - this.x * v.z;
		double crossZ = this.x * v.z - this.y * v.z;
		return new Vetor(crossX, crossY, crossZ);
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
