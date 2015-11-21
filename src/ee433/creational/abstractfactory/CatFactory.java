package ee433.creational.abstractfactory;

public class CatFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}
