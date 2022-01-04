
package KonversiBeratti.PraktikumKonversiBerat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class KonversiBeratC {
    
    @RequestMapping("/Berat")
    public String getBerat(){
        String konversi = " ";
        
        double Kilogram = 5;
        double Ons = 14;
        double Gram = 17;
        
        double Berat;
        
        String pilih = "Ons";
        
        if (pilih=="Kg"){
            Berat = Ons*0.1; //Ons to Kg
            konversi = "Berat Kg : " + Berat; 
        } else if (pilih == "ons"){
            Berat = Kilogram*10; //Kg to Ons
            konversi = "Berat g : " + Berat;
        } else {
            konversi = "Tidak di temukan";
        }
        return konversi;
    }
}
