package standard_classes;

import java.util.Calendar;
import java.util.Date;

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
//           StringBuffer buffer= new StringBuffer();
//           buffer.append("Elisa");
//           buffer.append(" ");
//           buffer.append("Septiani");
//           buffer.append(" ");
//           buffer.append("Lubis");
//           
//           String nameBuffer =buffer.toString();
//           System.out.println(nameBuffer);
//           
//           StringBuilder builder= new StringBuilder();
//           builder.append("Elisa");
//           builder.append(" ");
//           builder.append("Septiani");
//           builder.append(" ");
//           builder.append("Lubis");
//           
//           String nameBuilder= builder.toString();
//           System.out.println(nameBuilder);
//====================== StringJoiner Classes===========================
//        StringJoiner joiner = new StringJoiner(",", "[", "]");
//
//        joiner.add("Elisa");
//        joiner.add("Septiani");
//        joiner.add("Lubis");
//        
//        String nameJoiner=joiner.toString();
//        System.out.println(nameJoiner);
//====================StringTokenizer===================================
//    String values="Elisa Septiani Lubis";
//    StringTokenizer tokenizer= new StringTokenizer(values, " ");
//    
//    while(tokenizer.hasMoreTokens()){
//        String token= tokenizer.nextToken();
//        System.out.println(token);
//    }
//====================Number Classes=======================
//        Integer intValue = 1000;
//
//        byte byteValue = intValue.byteValue();
//        long longValue = intValue.longValue();
//        float floatValue = intValue.floatValue();
//        double doubleValue = intValue.doubleValue();
//        short shortValue = intValue.shortValue();
//
//        String valueString="elisa";
//        
//        Integer contohInteger= Integer.valueOf(valueString);
//        int contohInt= Integer.parseInt(valueString);
//=====================Data and Calender Classes========================
        Date tanggal = new Date();
        Date tanggal2 = new Date(968572736000L);
        System.out.println(tanggal);
        System.out.println(tanggal2);
        
        Calendar calender= Calendar.getInstance();
        calender.set(Calendar.YEAR, 2000);
        calender.set(Calendar.MONTH, Calendar.JANUARY);
        
        Date result= calender.getTime();
        System.out.println(result);

    
    }

}
