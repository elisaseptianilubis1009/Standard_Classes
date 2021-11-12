
package standard_classes;

public class Standard_Classes {


    public static void main(String[] args) {
//        ==================String Classes=============================
//        String name = "Elisa Septiani Lubis";
//        String lowerCase= name.toLowerCase();
//        String upperCase=name.toUpperCase();
//        
//        String[] array=name.split(" ");
//        
//        
//        System.out.println("Name :"+name);
//        System.out.println("Lower :"+lowerCase);
//        System.out.println("Upper :"+upperCase);
//        System.out.println("Length :"+name.length());
//        System.out.println("Start :"+name.startsWith("Elisa"));
//        System.out.println("End :"+name.endsWith("Lubis"));
//        System.out.println("Panjang Array :"+array.length);
//        
//        
//        for(String value : array){
//            System.out.println(value);
//        }
//        System.out.println(" ".isEmpty());// membaca spasi sebagai char
////        System.out.println(" ".isBlank);// tidak membaca spasi

//==============StringBuffer dan StringBuilder Classes
           StringBuffer buffer= new StringBuffer();
           buffer.append("Elisa");
           buffer.append(" ");
           buffer.append("Septiani");
           buffer.append(" ");
           buffer.append("Lubis");
           
           String nameBuffer =buffer.toString();
           System.out.println(nameBuffer);
           
           StringBuilder builder= new StringBuilder();
           builder.append("Elisa");
           builder.append(" ");
           builder.append("Septiani");
           builder.append(" ");
           builder.append("Lubis");
           
           String nameBuilder= builder.toString();
           System.out.println(nameBuilder);
           
                   
        
        
    }
    
}
