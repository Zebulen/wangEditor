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
@WebServlet(name = "EditorServlet", urlPatterns = {"/editor"})
public class EditorServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.log("editor");
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
    }
}
