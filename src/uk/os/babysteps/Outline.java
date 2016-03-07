/*
 * Multi-line comments using C-like syntax can appear anywhere.
 * 
 * The package declaration describes the path to this class definition and also provides a namespace for the class.
 * From the package name we can deduce that the file is located in the folder uk/os/babysteps from the root of the source tree.
 * The full name of this class is infact uk.os.babysteps.Outline, the package can be used to discriminate between classes with
 * the same name. As a consequence a class name is unique within a package.
 */
package uk.os.babysteps;

// This is a single line comment

/*
 *  After the package declaration and before the class declaration comes import statement. We must import other classes that
 *  we make use of so the compiler knows what classes we are referring to. Below we have imported a few classes. 
 */
import java.text.ParseException;		// Single line comments can appear at the end of a line of code
import java.text.SimpleDateFormat;		/* So can block comments */
import java.util.Date;

// Next is the class definition. A Class is a template for creating objects. This may sound strange at first, but consider a
// person; they have a name and a date of birth. Each individual person would have their own unique values for name and date of
// birth, the class just defines these attributes and when an object is create provides space for the unique value to be stored

/*
 * The class is defined as public as it can be accessed freely. This is known as the scope or visibility.
 * Following the scope is the class keyword, there are other options as we will see soon.
 * Finally we have the name of the class; Outline.
 * Following the name of the class are opening and closing squiggly brackets {}. They define the contents of the class, all
 * definitions must be contained inside the block defined by the braces. This is true for all Java constructs - squiggly
 * brackets define a block of code.
 * 
 * CONVENTION: Class names should start with a Capital letter, be the same as the name of the file containing them and follow CamelCase style.
 */
public class Outline {

	// Object scoped properties and methods are defined inside of the class definition.
	// No code exists at this level, all code must be contained inside of a method in a Java application
	
	// The name property then - scoped as private so can only be accessed from within the class itself
	// Its a String data type meaning it can contain strings of characters
	// Its called name
	// CONVENTION: property and method names should start with a lower case letter and follow CamelCase style
	private String name;

	// The dateOfBirth property
	// Its a object of type Date - more on this soon
	private Date dateOfBirth;
	
	/*
	 * A class requires one or more constructors. A constructor is a method that is responsible for creating an object instance
	 * of a class. The constructor is often responsible for configuring or initialising an object. If you do not define a
	 * constructor then a default one is assumed that takes no parameters and does nothing. The constructor always has the same
	 * name as the class and does not return anything, if they are made public then object instances of the class can be created
	 * anywhere in a program - there are special cases when you may want a private or protected visibility, but thats a way
	 * down the road.
	 * 
	 * CONVENTION: Constructor name should be same as class name. If none specified a default is assumed that does nothing.
	 */
	public Outline() {
	}

	/*
	 * This is an example of a constructor that accepts parameters that it uses to initialise an object during instantiation.
	 */
	public Outline(String name, String dateOfBirth) throws ParseException {
		// The this keyword refers to the instance being created, the dot is a notation for accessing properties and methods of an object
		// The following line sets the instance property name to the value of the name passed as a parameter to the constructor
		this.name = name;
		// The following line sets the instance property dateOfBirth to the value of the dateOfBirth passed as a parameter to the constructor
		// However we use a method of this object to convert from the string representation of a date to the internal Date type
		this.dateOfBirth = stringToDate(dateOfBirth);
	}
	
	/*
	 * Following are two methods that can be used to obtain the values of an instances name and age. These effectively provide a read-only
	 * view of an instance, the values are set when the instance is created and can be read using these methods.
	 * A method has scope, if public then the method can be accessed from outside of the class. Private methods are used to hide internal
	 * complexity.
	 * A method must have a return type that defines the type of data being returned.
	 * CONVENTION: A method that returns a property of a class is called a Getter, its name should start get followed by capitalised name of the property
	 */
	
	public String getName() {
		// As there is no ambiguity here there is no need to use the this identifier
		// The return keyword should precede the value returned by a method. Though a method may contain any number of return statements it is
		// good practise to keep to a minimum and preferably just one exit point from a method.
		return name;
	}
	
	public Date getDateOfBirth() {
		// Even though there is no ambiguity the use of the this identifier is still allowed, its a matter of personal preference
		return this.dateOfBirth;
	}
	
	// Methods can also throw exceptions when something bad happens, the calling method will have to deal with this exception to happy path
	public Date stringToDate(String dateAsString) throws ParseException {
		// We create an instance of SimpleDateFormat using the new keyword and store a reference to the object in a variable called sdf
		// We use SimpleDateFormats constructor that accepts a format pattern that describes what a date looks like
		// Like all Java core classes the documentation can be read online and also in IDE
		// https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// We use the SimpleDateFormat instance to convert the date into a string
		return sdf.parse(dateAsString);
	}

	// The toString method has special significance. By default it will return the object reference, however it can be overridene to provide
	// more information such as in this case where we return a better description of an instance.
	// And then there is the following annotation that tells the compiler that this method overrides a method in the parent object with the same name.
	// In this example the parent object is Object, the base class that all Java objects are derived from.
	// This method is invoked whenever there is an implicit type conversion to type String, for example printing an object!
	@Override
	public String toString() {
		return "My name is " + name + " and I was born on " + dateOfBirth;
	}
	
	/*
	 * There is a special method called main that is know as the program entry point. Typically an application will comprise of many classes, only
	 * one of them would have a main method. The main method provides a means of launching an application and accessing supplied command line 
	 * parameters.
	 * 
	 * The static identifier means that this method can be accessed without having to instantiate an object first.
	 */
	public static void main(String[] args) {
		
		// try / catch blocks surround areas of code that can generate exception
		// any exception thrown inside the try block should be dealt with inside a corresponding catch block
		try {
			// We create three instances of the Outine class and store the references in variables called one, two and three
			// In each case a new object instance is created and initialisation parameters are supplied
			Outline one = new Outline("Paul", "22/05/1965");
			Outline two = new Outline("Claire", "08/09/1967");
			Outline three = new Outline("Petra", "28/03/1971");
			
			/*
			 * Notice that we have one Class of type Outline - the template for Outline objects
			 * We have used the new command to create three object instances of type Outline
			 */

			System.out.println(one);
			System.out.println(two);
			System.out.println(three);

			// We can access public methods of an object instance using the dot notation
			System.out.println(one.getName());
			
			// When an exception happens code execution stops and exit jumps directly to the catch block
			Outline bad = new Outline("BAD", "This is not a date and will cause a parse exception");
			System.out.println("This line will not be printed");
			
			// The catch block(s) follows, there will be one for each exception trapped
		} catch (ParseException e) {
			// Let the exception describe itself
			e.printStackTrace();
			// The finally block follows and this will always be executed
		} finally {
			System.out.println("I will always be printed, even if an exception has occurred.");
		}
		
		// When the main method finishes are application may not end - it depends if other threads of execution were started. For these simple
		// cases though, end of main is the end of the program!
	}
	
}
