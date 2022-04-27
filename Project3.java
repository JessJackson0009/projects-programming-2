import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.io.*;
/**
 * class for project3
 */
public class Project3{
    /**
     * abstract class for shape that will be used for all shapes to be made
     */
        abstract static class Shape{
                protected String name;
    
                abstract double getArea();
                public void setName(String newName){
                    this.name = newName;
                }
                public String getName(){
                    return this.name;
                }
    
        }
        /**
         * class for rectangle
         */
        public static class Rectangle extends Shape{
    
        public double area;
    
            public void setArea(double base, double height){
                area = base * height;
            }
            public double getArea(){
                return area;
            }
        }
        /**
         * class for square
         */
        public static class Square extends Rectangle{
    
            public double base;
            public double area;
    
            public void setArea(double base, double height){
                area = base * base;
            }
            @Override
            public double getArea(){
                return area;
            }
            }
            /**
             * class for triangle
             */
        public static class Triangle extends Shape{
        
            public double base;
            public double height;
            public double area;
    
            public void setArea(double base, double height){
                area = base * height * 0.5;
            }
            public double getArea(){
                return area;
            }
        }
        /** 
         * class for circle
         */
        public static class Circle extends Shape{
    
            public double radius;
            public double area;
    
            public void setArea(double radius){
                area = Math.PI * radius * radius;
            }
            public double getArea(){
                return area;
            }
        }
    
/**
 * @string args[0] takes a file name in and parses thought to find certain values for shapes.
 */
    public static void main (String args[]){
        
    
        if(args.length != 1){
            System.out.println("Usage: java Project3 <filename>");
            System.exit(0);
    }
        try(
            FileInputStream file = new FileInputStream(args[0]);
            DataInputStream in = new DataInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            
    )
    {
        String line;
        String ShapeType;
        String ShapeName;
        double value1;
        double value2;
        String array[] = new String[4];
        /*Rectangle rec = new Rectangle(ShapeType, ShapeName, value1, value2); 
        Square sq = new Square(ShapeType, ShapeName, value1);
        Circle ci = new Circle(ShapeType, ShapeName, value1);
        Triangle tri = new Triangle(ShapeType, ShapeName, value1, value2);*/
        ArrayList<Shape> elements = new ArrayList<Shape>();
        while((line = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line, ",");
            for(int i =0; i < 4; ++i){
                array[i] = st.nextToken();
                ShapeType = array[0];
                /*if(ShapeType.equals("Rectangle")){
                    Rectangle rec = new Rectangle(ShapeType, ShapeName, value1, value2);
                }
                if(ShapeType.equals("Square")){
                    Rectangle rec = new Square(ShapeType, ShapeName, value1, value2);
                }
                if(ShapeType.equals("Triangle")){
                    Rectangle rec = new Triangle(ShapeType, ShapeName, value1, value2);
                }
                if(ShapeType.equals("Circle")){
                    Rectangle rec = new Circle(ShapeType, ShapeName, value1, value2);
                }*/
                ShapeName = array[1];
                value1 = Double.parseDouble(array[2]);
                value2 = Double.parseDouble(array[3]);
                // this was to check it loaded in array correctly
                //System.out.println(array[i]);
            } 
            
        }
    }
    


    catch(FileNotFoundException fnf){
            System.out.println(args[0] + " not found");
    }

    catch(IOException ioe){
        System.out.println("Input Output Error");
    }
    catch(Exception noSuchelementException){
        System.out.println(noSuchelementException.toString());
    }

}
}





