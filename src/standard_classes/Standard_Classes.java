
package standard_classes;

public class Standard_Classes {


    public static void main(String[] args) {
        String name = "Elisa Septiani Lubis";
        String lowerCase= name.toLowerCase();
        String upperCase=name.toUpperCase();
        
        String[] array=name.split(" ");
        
        
        System.out.println("Name :"+name);
        System.out.println("Lower :"+lowerCase);
        System.out.println("Upper :"+upperCase);
        System.out.println("Length :"+name.length());
        System.out.println("Start :"+name.startsWith("Elisa"));
        System.out.println("End :"+name.endsWith("Lubis"));
        System.out.println("Panjang Array :"+array.length);
        
        
        for(String value : array){
            System.out.println(value);
        }
        System.out.println("".isEmpty());
        
        
    }
    
}
