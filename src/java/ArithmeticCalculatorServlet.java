/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 810585
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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

        response.setContentType("text/html;charset=UTF-8");

        String first = request.getParameter("first");
        String second = request.getParameter("second");

        String button = request.getParameter("button");

        if (button == null) {
            request.setAttribute("result", "---");
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        }
        if (first == "" && second == "") {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        } else if (first == "") {
            request.setAttribute("result", "invalid");
            request.setAttribute("second", second);
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        } else if (second == "") {
            request.setAttribute("result", "invalid");
            request.setAttribute("first", first);
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        } else if (!isInteger(first) || !isInteger(second)) {
            request.setAttribute("result", "invalid");
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        } else {
            if (button.equals("+")) {
                request.setAttribute("result", Integer.parseInt(first) + Integer.parseInt(second));
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
            }
            if (button.equals("-")) {
                request.setAttribute("result", Integer.parseInt(first) - Integer.parseInt(second));
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
            }
            if (button.equals("*")) {
                request.setAttribute("result", Integer.parseInt(first) * Integer.parseInt(second));
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
            }
            if (button.equals("%")) {
                request.setAttribute("result", Integer.parseInt(first) / Integer.parseInt(second));
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
            }
        }

    }

    //Taken from https://stackoverflow.com/questions/237159/whats-the-best-way-to-check-if-a-string-represents-an-integer-in-java
    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
