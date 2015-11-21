package ee433.creational.abstractfactory;

public class AbstractFactoryClient {
	public AnimalFactory animalFactory; 
	
	public AbstractFactoryClient (AnimalFactory factory){
		animalFactory = factory;
	}
	
	public AbstractFactoryClient() {
		//no default factory
	}

	public void theAnimalSays(){
		Animal a = animalFactory.createAnimal();
		System.out.println("The " + a.name + " says " + a.sound);
	}
}
