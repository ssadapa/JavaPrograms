import Cars.Coupe;
import Cars.fourD;

public class Autocars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coupe BMW = new Coupe();
		BMW.name = "328i Coupe";
		BMW.isOn = true;
		
		Coupe Hyundai = new Coupe();
		Hyundai.name = "Elantra";
		Hyundai.isOn = false;
		
		
		
		fourD Lexus = new fourD();
		
	
		Hyundai.printCar(2000);
		Lexus.isAuto();
		
		String name = BMW.getCarName();
		System.out.println(name);
		
		String hyundaicar = Hyundai.getCarName();
		System.out.println(hyundaicar);
		
	}

}
