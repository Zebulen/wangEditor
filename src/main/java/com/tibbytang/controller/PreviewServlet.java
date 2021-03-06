package com.tibbytang.controller;

import com.tibbytang.util.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tibbytang on 30/12/2016
 * QQ:562980080
 * wechat:ITnan562980080
 * Email:562980080@qq.com
 */
@WebServlet(name = "PreviewServlet", urlPatterns = {"/preview"})
public class PreviewServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = request.getParameter("page");
        logger.log(page);
        request.setAttribute("page",page);
        request.getRequestDispatcher("WEB-INF/preview.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
