import java.util.function.Function;

import com.company.Car;
import com.company.ElectricCar;
import com.company.Functions;

/**
 * Entry point to the app
 * 
 * @author FacundoRocha
 */

public class App {
	public static void main(String[] args) throws Exception {

		Car car = new Car("Nissan", "250z", "2005", "Dark Gray", 25000.00);
		ElectricCar electricCar = new ElectricCar("Tesla", "X", "2020", "Snow White", 60000.00, "Electric", 300);

		System.out.println(car.toString());
		System.out.println(electricCar.toString());

		car.speedup(120);
		electricCar.speedup(120);
	}
}
