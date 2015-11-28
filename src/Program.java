/**
 *  File: Program.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/21/2015 pmc - initial coding<br/>
 *	
 */

import java.util.Vector;

import ee433.behavior.command.*;
import ee433.behavior.observer.*;
import ee433.creational.abstractfactory.*;
import ee433.creational.singleton.*;
import ee433.structural.adapter.*;
import ee433.structural.composite.*;


public class Program {

	public static void main(String[] args) {
		write("Peter Corcoran - EE433");
		
		runAbstractFactoryExample();
		runSingletonExample();
		runAdapterExample();
		runCompositeExample();
		runObserverExample();
		runCommandExample();
	}
	
	public static void runAbstractFactoryExample(){
		write("");
		write("------------------------------------------------------------");
		write("     Abstract Factory Example"); 
		write("------------------------------------------------------------");
		write("Create Animal Factories");
		
		CatFactory cf = new CatFactory();
		DogFactory df = new DogFactory();
		BullDogFactory bf = new BullDogFactory();
		
		write("Create Abstract Factory Client 1 - Cat");
		AbstractFactoryClient afClient1 = new AbstractFactoryClient(cf);
		afClient1.theAnimalSays();
		
		write("Create Abstract Factory Client 2 - Dog");
		AbstractFactoryClient afClient2 = new AbstractFactoryClient(df);
		afClient2.theAnimalSays();
		
		write("Create Abstract Factory Client 3 - Bull Dog");
		AbstractFactoryClient afClient3 = new AbstractFactoryClient(bf);
		afClient3.theAnimalSays();
		
		write("");
		write("------------------------------------------------------------");
		
	}
	
	public static void runSingletonExample(){
		write("");
		write("------------------------------------------------------------");
		write("     Singleton Example"); 
		write("------------------------------------------------------------");
		write("");
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		write("Singleton data: " + s1.SingletonOperation(""));
		write("Modify data for first reference: " + s1.SingletonOperation(" s1 "));
		write("Modify data for second reference: " + s2.SingletonOperation(" s2 "));
		
		write("");
		write("Singleton Score Example");
		
		Score scr1 = Score.getInstance();
		write("Add point: " + scr1.addPoints(100).toString());
		Score scr2 = Score.getInstance();
		write("Add more point: " + scr2.addPoints(100).toString());
		
		write("------------------------------------------------------------");
	}
	
	public static void runAdapterExample(){
		write("");
		write("------------------------------------------------------------");
		write("     Adapter Example"); 
		write("------------------------------------------------------------");
		write("");
		write("Create AC Socket");
		ACSocket ac = new ACSocket();
		write("Create 5V adapter ");
		VoltageAdapter5V va = new VoltageAdapter5V(ac);
		write("Plug adapter into client");
		DC5VClient client = new DC5VClient(va);
		write(client.getPower());
		write("------------------------------------------------------------");
	}
	
	public static void runCompositeExample(){
		write("");
		write("------------------------------------------------------------");
		write("     Composite Example"); 
		write("------------------------------------------------------------");
		write("");
		
		Directory root = new Directory();
		root.name = "root";
		write("Create root directory: " + root.name);
		
		write("Create file1, add to root");
		File f1 = new File("file1");
		root.add(f1);
		write("Create directory 2");
		Directory dir2 = new Directory();
		dir2.name = "directory2";
		write("Create file2, add to directory 2");
		dir2.add(new File("file2"));
		root.add(dir2);	
		write("Recursively walk the root object...");
		writeFso(root, "root\\");
	
		write("------------------------------------------------------------");
	}
	
	public static void writeFso(IFileSystemObject fso, String path){
        Directory root = (Directory) fso;
        Vector<IFileSystemObject> list = root.subitems;

        if (list == null) return;

        for ( IFileSystemObject f :  root.subitems) {
            if ( f instanceof Directory ) {
            	write(path + f.getFileName() );
                writeFso(f, path  + f.getFileName()+ "\\");
                            }
            else {
                write(path + f.getFileName() );
            }
        }
	    
	}

	public static void runObserverExample(){
		write("");
		write("------------------------------------------------------------");
		write("     Observer Example"); 
		write("------------------------------------------------------------");
		write("");
		
		Subject sub = new Subject();
		sub.name = "subject1";
		
		Observer watcher = new Observer();
		watcher.name = "watcher";
		Observer watcher1 = new Observer();
		watcher1.name = "watcher1";
		Observer watcher2 = new Observer();
		watcher2.name = "watcher2";
		sub.attach(watcher);
		sub.attach(watcher1);
		sub.attach(watcher2);
		sub.notifyObservers();
	
		write("------------------------------------------------------------");
	}
	
	public static void runCommandExample(){
		write("");
		write("------------------------------------------------------------");
		write("     Command Example"); 
		write("------------------------------------------------------------");
		write("");
		write("Create Computer Object");
		Computer c = new Computer();
		write("create new switch and concrete command objects");
		Switch s = new Switch(new ComputerOnCommand(c), new ComputerOffCommand(c));
		s.PressOn();
		s.PressOff();
		write("------------------------------------------------------------");
	}
	
	
	public static void write(String msg){
		System.out.println(msg);
	}

}