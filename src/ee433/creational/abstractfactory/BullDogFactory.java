package ee433.creational.abstractfactory;

public class BullDogFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		Dog d = new Dog();
		d.name = "Bull Dog";
		d.sound = "BARK!";
		return d;
	}

}
