import com.company.*;
import com.company.interfaces.CarService;
import com.company.interfaces.CarServiceImpl;

import java.util.Scanner;

/**
 * Entry point to the app
 * 
 * @author FacundoRocha
 */

public class App {
	public static void main(String[] args) {

		Person person1 = new Person("Nacho", "Arias", 24);

		person1.walk(5, "Forward");

		/*Car car = new GasolineCar("Nissan", "Fairlady 250z", "2005", "Dark Gray", 25000.00, "gasoline", 100);

		CarService service = new CarServiceImpl();

		System.out.println(service.washCar(car));
		System.out.println(service.maintainCar(car));
		System.out.println(service.repairCar(car));*/

		try {
			readName();
		} catch (NameFormatException e) {
			e.printStackTrace();
		}
	}
	private static void readName() throws NameFormatException {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Write a name");

		while (keyboard.hasNext()) {
			System.out.println("Write a name");
			String name = keyboard.nextLine();

			if(name.length() < 2) {
				keyboard.close();
				throw new NameFormatException("The name must have more than 1 characters");
			}
		}
	}
}
