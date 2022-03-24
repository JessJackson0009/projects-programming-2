/**
 * This class is used to define a sphere with a user-defined name and a set radius. 
 * The sphere has tools in pllace to set the radius to zero if it had been defined as a negative number
 */
public class Sphere extends Object implements Comparable {
    private double radius;
    private String name;
/**
 * basic method for the sphere with the default name and radius
 */
Sphere(){
    this.radius = 0;
    this.name = "NoName";
}
/**
 * Overridding default sphere method defining name and radius. checks to see if name is blank and if radius is a negative number.
 * if either are true, the name becomes the default name ("NoName") and the radius becomes 0.
 * @param InitName
 * @param Initradius
 */
Sphere(String InitName, double Initradius){
    if(InitName.isEmpty()){
        this.name ="NoName";
    }
    else{
        this.name = InitName;
    }
    if(Initradius < 0){
        throw new IllegalArgumentException();
}
    else{
        this.radius = Initradius;
    }
}
/**
 * @return double the value for the volume of the sphere
 */
public double volume(){
    return 4.0/3.0 * 3.14 * this.radius * this.radius * this.radius;
}
/**
 * @return double the value for the surface area of the sphere
 */
public double surfaceArea(){
    return 4.0  * 3.14 * (this.radius * this.radius);
}
/**
 * leaves radius unchanged unless the value is negative then it throws an illegal argument exception
 * @param NewRadius
 */
public void setRadius(double NewRadius){
    if(NewRadius >= 0){
        this.radius = NewRadius;
    }
    else{
        throw new IllegalArgumentException("cannot have a radius value of less then zero");
    }
}
/**
 * @return double value for radius of the sphere.
 */
public double getRadius(){
    return this.radius;
}
/**
 * sets NewName as the new value for name
 * @param NewName
 */
public void setName(String NewName){
    this.name = NewName;
}
/**
 * @return String value for name of the sphere.
 */
public String getName(){
    return this.name;
}
/**
 * @return String the string representaion of the sphere: "This Sphere's name is (name) and it has a radius of (radius)
 */
public String toString(){
    return "This Sphere's name is " + this.name + " and it has a radius of " + this.radius;
}
/**
 * @param O
 * @return int value for object o
 */
public int compareTo(Object O){
    return 0;
}
/**
 * @param O
 * @return int compares two spheres based on there radius and returns the value 0 if equal and 1 or -1 if unequal
 */
public int compareTo(Sphere O){
    int answer = 0;
    if(this.radius == O.radius){
        answer = 0;
    }
    if(this.radius < O.radius ){
        answer = -1;
    }
    if(this.radius > O.radius){
        answer = 1;
    }
    return answer;
}
/**
 * main method
 * @param args
 */
public static void main(String[] args){
    Sphere Sphere;

    Sphere = new Sphere("", 9);
    System.out.println(Sphere);

    try{
        Sphere = new Sphere("yyy", -14);
        System.out.println(Sphere.name);
    }
    catch(Exception e){
        System.out.println(e.toString() + " --> Illegal argument please choose a value greater then or equal to 0");
    }
    Sphere = new Sphere();
    System.out.println(Sphere);

    Sphere = new Sphere("", 0);
    System.out.println(Sphere);

    double test;

    for(test = -10; test <= 10; test++){
        
        try{
        Sphere.setRadius(test);
        }
        catch(IllegalArgumentException iae){
            System.out.println("Exception" + iae.toString() + " please enter a valid argument");
        }
        Sphere.setName("y");
        System.out.println(Sphere + " which makes it Volume " + Sphere.volume() + " and its surface area " + Sphere.surfaceArea());
    }
       Sphere one;
       Sphere two;

       one = new Sphere("one", 2);
       two = new Sphere("two", 2);
       if(one.compareTo(two) == 0){
           System.out.println("spheres are equal");
       }
       else{
           System.out.println("spheres are not equal");
       }
       one = new Sphere("one", 5);
       two = new Sphere("two", 2);
       if(one.compareTo(two) == 0){
           System.out.println("spheres are equal");
       }
       else{
           System.out.println("spheres are not equal");
       }
}
}
