/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author viter
 */
@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {
Calendar calendar = new GregorianCalendar();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String lang = request.getParameter("lang");
        if(lang==null) {
            lang = "por";
        }

        String ola = this.cumprimentos(lang);
        
        String nome = request.getParameter("nome");
        if(nome == "") {
            nome = "Fulano";	
        }
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" +ola+nome+ "!</h1>"+"Horario: "+calendar.get((Calendar.HOUR_OF_DAY)));   
             
            response.setContentType("text/html");
              
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String lang = request.getParameter("lang");
        if (lang==null) {
            lang = "por";
        }

        String ola = this.cumprimentos(lang);
        
        String nome = request.getParameter("nome");
        if(nome == "") {
            nome = "Fulano";	
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" +ola+nome+ "!</h1>"+"Horario: "+calendar.get((Calendar.HOUR_OF_DAY)));            
            out.println("</body>");
            out.println("</html>");
        }
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	String lang = request.getParameter("lang");
        if(lang==null) {
            lang = "por";        	
        }

        String ola = this.cumprimentos(lang);
        
        String nome = request.getParameter("nome");
        if(nome == "") {
            nome = "Fulano";
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" +ola+nome+"!</h1>"+"Horario: "+calendar.get((Calendar.HOUR_OF_DAY)));            
            out.println("</body>");
            out.println("</html>");
        }
    }

    public String cumprimentos(String lang) {
    	String msg = "";
    	switch (lang) {
    	case "":
        case "pt":
            if(calendar.get(Calendar.HOUR_OF_DAY) <= 12) {
                msg = "Bom dia, ";
            }else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) <= 18)) {
                msg = "Boa tarde, ";
            }else if(calendar.get(Calendar.HOUR_OF_DAY) > 18){
                msg = "Boa noite, ";
            }	        	
        break;
        case "en":
            if(calendar.get(Calendar.HOUR_OF_DAY) <= 12) {
                msg = "Good morning, ";
            }else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) <= 18)) {
                msg = "Good afternoon, ";
            }else if(calendar.get(Calendar.HOUR_OF_DAY) > 18){
                msg = "Good night, ";
            }	  
        break;
        case "fr":
            if(calendar.get(Calendar.HOUR_OF_DAY) <= 12) {
                msg = "Bonjour, ";
            }else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) <= 18)) {
                msg = "Bonne apres-midi, ";
            }else if(calendar.get(Calendar.HOUR_OF_DAY) > 18){
                msg = "Bonne nuit, ";
            }
        break;
        case "de":
            if(calendar.get(Calendar.HOUR_OF_DAY) <= 12) {
                msg = "Guten Morgen, ";
            }else if(calendar.get((Calendar.HOUR_OF_DAY)) > 12 && (calendar.get(Calendar.HOUR_OF_DAY) <= 18)) {
                msg = "Guten Nachmittag, ";
            }else if(calendar.get(Calendar.HOUR_OF_DAY) > 18){
                msg = "Gute Nacht, ";
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
            default:
                msg = "Erro - Opção invalida!";
                break;
            }
    	
    	return msg;
    }

}


