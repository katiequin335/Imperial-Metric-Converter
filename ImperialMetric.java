import javax.swing.*;
  
  public class ImperialMetric{
  
  public static void main(String[] args){
    String convertType = JOptionPane.showInputDialog("What type of conversion do you require?");
    String input = JOptionPane.showInputDialog("Enter amount here");
    int convertInt = Integer.parseInt(input);
    
    
    //LENGTH CONVERSIONS
    
    //inches
    if (convertType.equals("in to cm")){
    System.out.println("That is equivalent to " + (convertInt*2.54) + " cm." );
    }
    
     if (convertType.equals("in to m")){
    System.out.println("That is equivalent to " + (convertInt*0.0254) + " m." );
    }
     
     //feet
       if (convertType.equals("ft to cm")){
    System.out.println("That is equivalent to " + (convertInt/0.0328084) + " cm." );
    }
        if (convertType.equals("ft to m")){
    System.out.println("That is equivalent to " + (convertInt*0.3048) + " m." );
    }
     if (convertType.equals("ft to km")){
    System.out.println("That is equivalent to " + (convertInt*0.0003048) + " km." );
    }
     
     //miles
     if (convertType.equals("mi to cm")){
    System.out.println("That is equivalent to " + (convertInt*160934) + " cm." );
    }
     if (convertType.equals("mi to m")){
    System.out.println("That is equivalent to " + (convertInt*1609.34) + " m." );
    }
     
     if (convertType.equals("mi to km")){
    System.out.println("That is equivalent to " + (convertInt*1.60934) + " km." );
    }
     
     
   //centimeters
    if (convertType.equals("cm to in")){
       System.out.println("That is equivalent to " + (convertInt/2.54) + " in." );
    }
    
    if (convertType.equals("cm to ft")){
       System.out.println("That is equivalent to " + (convertInt*0.0328084) + " ft." );
    }

    if (convertType.equals("cm to mi")){
    System.out.println("That is equivalent to " + (convertInt*0.0000062137) + " mi." );
    }
    
    //meters
     if (convertType.equals("m to in")){
    System.out.println("That is equivalent to " + (convertInt*39.3701) + " in." );
    }
     
     if (convertType.equals("m to ft")){
    System.out.println("That is equivalent to " + (convertInt*3.28084) + " ft." );
    }
     
      if (convertType.equals("m to mi")){
    System.out.println("That is equivalent to " + (convertInt*0.000621371) + " mi." );
    }
      
      //kilometers
       if (convertType.equals("km to ft")){
    System.out.println("That is equivalent to " + (convertInt*3280.84) + " ft." );
    }
        if (convertType.equals("km to mi")){
    System.out.println("That is equivalent to " + (convertInt*0.621371) + " mi." );
    }
        
    //VOLUME CONVERSIONS 
        
    //gallons
       if (convertType.equals("gallons to ml")){
    System.out.println("That is equivalent to " + (convertInt*3785.41) + " ml." );
    } 
       if (convertType.equals("gallons to L")){
    System.out.println("That is equivalent to " + (convertInt*3.78541) + " L." );
    } 
      
    //quarts
       if (convertType.equals("quarts to ml")){
    System.out.println("That is equivalent to " + (convertInt*946.353) + " ml." );
    }  
       if (convertType.equals("quarts to L")){
    System.out.println("That is equivalent to " + (convertInt*0.946353) + " L." );
    }  
       
    //pints
       if (convertType.equals("pints to ml")){
    System.out.println("That is equivalent to " + (convertInt*473.176) + " ml." );
    }    
        if (convertType.equals("pints to L")){
    System.out.println("That is equivalent to " + (convertInt*0.473176) + " L." );
    }  
    
    //cups
         if (convertType.equals("cups to ml")){
    System.out.println("That is equivalent to " + (convertInt*236.588) + " ml." );
    }    
        if (convertType.equals("cups to L")){
    System.out.println("That is equivalent to " + (convertInt*0.236588) + " L." );
    }  
        
    //ounces
        if (convertType.equals("oz to ml")){
    System.out.println("That is equivalent to " + (convertInt*29.5735) + " ml." );
    }    
        if (convertType.equals("oz to L")){
    System.out.println("That is equivalent to " + (convertInt*0.0295735) + " L." );
    }
        
    //tablespoons
         if (convertType.equals("tbsp to ml")){
    System.out.println("That is equivalent to " + (convertInt*14.7868) + " ml." );
    }    
        if (convertType.equals("tbsp to L")){
    System.out.println("That is equivalent to " + (convertInt*0.0147868) + " L." );
    }
        
    //teaspoons
     if (convertType.equals("tsp to ml")){
    System.out.println("That is equivalent to " + (convertInt*4.92892) + " ml." );
    }    
        if (convertType.equals("tsp to L")){
    System.out.println("That is equivalent to " + (convertInt*0.00492892) + " L." );
    }   
        
     //millileters
         if (convertType.equals("ml to gallons")){
    System.out.println("That is equivalent to " + (convertInt*0.000264172) + " gallons." );
    }
         if (convertType.equals("ml to quarts")){
    System.out.println("That is equivalent to " + (convertInt*0.00105669) + " quarts." );
    }  
         if (convertType.equals("ml to pints")){
    System.out.println("That is equivalent to " + (convertInt*0.00211338) + " pints." );
    } 
         if (convertType.equals("ml to cups")){
    System.out.println("That is equivalent to " + (convertInt*0.00422675) + " cups." );
    } 
         if (convertType.equals("ml to oz")){
    System.out.println("That is equivalent to " + (convertInt*0.033814) + " oz." );
    } 
      if (convertType.equals("ml to tbsp")){
    System.out.println("That is equivalent to " + (convertInt*0.067628) + " tbsp." );
    }  
      if (convertType.equals("ml to tsp")){
    System.out.println("That is equivalent to " + (convertInt*0.202884) + " tsp." );
    }  
      
      //liters
        if (convertType.equals("L to gallons")){
    System.out.println("That is equivalent to " + (convertInt*0.264172) + " gallons." );
    }
         if (convertType.equals("L to quarts")){
    System.out.println("That is equivalent to " + (convertInt*1.05669) + " quarts." );
    }  
         if (convertType.equals("L to pints")){
    System.out.println("That is equivalent to " + (convertInt*2.11338) + " pints." );
    } 
         if (convertType.equals("L to cups")){
    System.out.println("That is equivalent to " + (convertInt*4.22675) + " cups." );
    } 
         if (convertType.equals("L to oz")){
    System.out.println("That is equivalent to " + (convertInt*33.814) + " oz." );
    } 
      if (convertType.equals("L to tbsp")){
    System.out.println("That is equivalent to " + (convertInt*67.628) + " tbsp." );
    }  
      if (convertType.equals("L to tsp")){
    System.out.println("That is equivalent to " + (convertInt*202.884) + " tsp." );
    }  
      
    //TEMPERATURE CONVERSIONS
    
    //celsius
       if (convertType.equals("celsius to fahrenheit")){
    System.out.println("That is equivalent to " + (((convertInt*9)/5)+32) + " degrees Fahrenheit." );
    }  
        if (convertType.equals("c to f")){
    System.out.println("That is equivalent to " + (((convertInt*9)/5)+32) + " degrees Fahrenheit." );
    }  
    
    //fahrenheit
         if (convertType.equals("fahrenheit to celsius")){
    System.out.println("That is equivalent to " + (((convertInt-32)*5)/9) + " degrees Celsius." );
    }  
            if (convertType.equals("f to c")){
    System.out.println("That is equivalent to " + (((convertInt-32)*5)/9) + " degrees Celsius." );
    } 
            
    //WEIGHT CONVERSIONS
     
    //ounces
    if (convertType.equals("oz to g")){
    System.out.println("That is equivalent to " + (convertInt*28.3495) + " grams." );
    } 
    
    if (convertType.equals("oz to kg")){
    System.out.println("That is equivalent to " + (convertInt*0.0283495) + " kilograms." );
    }
    
    if (convertType.equals("oz to stone")){
    System.out.println("That is equivalent to " + (convertInt*0.00446429) + " stone." );
    }
    
    //pounds
     if (convertType.equals("lb to g")){
    System.out.println("That is equivalent to " + (convertInt*453.592) + " grams." );
    }
     
     if (convertType.equals("lb to kg")){
    System.out.println("That is equivalent to " + (convertInt*0.453592) + " kilograms." );
    }
     
     if (convertType.equals("lb to stone")){
    System.out.println("That is equivalent to " + (convertInt*0.0714286) + " stone." );
    }
     
     //grams
      if (convertType.equals("g to oz")){
    System.out.println("That is equivalent to " + (convertInt*0.035274) + " ounces." );
    }
      
      if (convertType.equals("g to lb")){
    System.out.println("That is equivalent to " + (convertInt*0.00220462) + " pounds." );
    }
      
    //kilograms
      if (convertType.equals("kg to oz")){
    System.out.println("That is equivalent to " + (convertInt*35.274) + " ounces." );
    }
      
      if (convertType.equals("kg to lb")){
    System.out.println("That is equivalent to " + (convertInt*2.20462) + " lb." );
    }
      
     //stone
      if (convertType.equals("stone to oz")){
    System.out.println("That is equivalent to " + (convertInt*224) + " ounces." );
    }
      
      if (convertType.equals("stone to lb")){
    System.out.println("That is equivalent to " + (convertInt*14) + " pounds." );
    }
  }
}