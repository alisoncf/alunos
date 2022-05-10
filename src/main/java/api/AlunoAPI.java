/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aluno;
import services.AlunoService;

/**
 *
 * @author Administrador
 */
@WebServlet("/aluno/*")
public class AlunoAPI extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/json;charset=UTF-8");
        Enumeration<String> head = request.getHeaderNames();
        try {
            String uri = request.getRequestURI();
            int i = uri.lastIndexOf("/");

            long id = Long.parseLong(uri.substring(i + 1, uri.length()));

            AlunoService a = new AlunoService();
            a.populate();

            Aluno aluno = a.getAluno(id);
            String json="{}";
            if (aluno == null) {
                 aluno = new Aluno();
            }
            json = new Gson().toJson(aluno);
            response.setStatus(200);
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Type", "application/json");
            response.getOutputStream().println(json);

        } catch (Exception e) {
            response.setStatus(400);
            response.getOutputStream().println(e.getMessage());

        }

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

    }

}
