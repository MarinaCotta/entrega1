package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String msg;
        private Calendar calendar = new GregorianCalendar();
    public MessageBean() {
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String value) {
        switch (value){
            case "":
            case "pt":
                if(calendar.get(Calendar.HOUR_OF_DAY) < 12) {
	        		msg = "Bom dia, ";
	        	}else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) > 17)) {
	        		msg = "Boa tarde, ";
	        	}else if(calendar.get(Calendar.HOUR_OF_DAY) > 17){
	        		msg = "Boa noite, ";
	        	}	        	
	            break;

            case "en":
               if(calendar.get(Calendar.HOUR_OF_DAY) < 12) {
	        		msg = "Good morning, ";
	        	}else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) > 17)) {
	        		msg = "Good afternoon, ";
	        	}else if(calendar.get(Calendar.HOUR_OF_DAY) > 17){
	        		msg = "Good night, ";
	        	}	  
	            break;
            case "de":
                if(calendar.get(Calendar.HOUR_OF_DAY) < 12) {
	        		msg = "Guten Morgen, ";
	        	}else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) > 17)) {
	        		msg = "Guten Nachmittag, ";
	        	}else if(calendar.get(Calendar.HOUR_OF_DAY) > 17){
	        		msg = "Gute Nacht, ";
	        	}	
	            break;
            case "fr":
               if(calendar.get(Calendar.HOUR_OF_DAY) < 12) {
	        		msg = "Bonjour, ";
	        	}else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) > 17)) {
	        		msg = "Bonne apr�s-midi, ";
	        	}else if(calendar.get(Calendar.HOUR_OF_DAY) > 17){
	        		msg = "Bonne nuit, ";
	        	}
	            break;
             case "it":
        	if(calendar.get(Calendar.HOUR_OF_DAY) <= 12) {
        		msg = "Buongiorno, ";
        	}else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) <= 18)) {
        		msg = "Buon pomeriggio, ";
        	}else if(calendar.get(Calendar.HOUR_OF_DAY) > 18){
        		msg = "Buona notte, ";
        	}
            break;
        case "el":
        	if(calendar.get(Calendar.HOUR_OF_DAY) <= 12) {
        		msg = "Kaliméra, ";
        	}else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) <= 18)) {
        		msg = "Kaló apógevma, ";
        	}else if(calendar.get(Calendar.HOUR_OF_DAY) > 18){
        		msg = "kalinychta, ";
        	}	 
            break;
                
        }
    }
}
