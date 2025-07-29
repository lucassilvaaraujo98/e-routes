package main;

public class Main {

	public static void main(String[] args) {
		Driver Dalva = new Driver(1, "dalvinha04", "fera", "Dalva", "Vila de Konoha, close to narutos house");
		User lucas = new User(1, "lucas1", "uninter1234", "lucas araujo", "av. das torres numero 709");
		
		System.out.printf("New trip order for: %n%5s!", Dalva.toString());

		System.out.printf("%nPassenger is:%n%5s", lucas.toString());
		lucas.toString();



	}

}
