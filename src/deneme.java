
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saygat
 */
public class deneme {
    public static void main(String[] args) {
        ArrayList<String> turkceArrayList = new ArrayList<>();
        ArrayList<String> ingilizceArrayList = new ArrayList<>();
        ArrayList<String> fransızcaArrayList = new ArrayList<>();
        ArrayList<String> almancaArrayList = new ArrayList<>();
      
        turkceArrayList.add("araba");
        ingilizceArrayList.add("car");
        fransızcaArrayList.add("fransızca araba");
        almancaArrayList.add("almanca araba");
        
        
        
        
        System.out.println(turkceArrayList.get(0) + " - " + ingilizceArrayList.get(0) + " - " + fransızcaArrayList.get(0) + " - " + almancaArrayList.get(0));
        
    }
}
