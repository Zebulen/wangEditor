package com.tibbytang.controller;

import com.tibbytang.util.Logger;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by tibbytang on 31/12/2016
 * QQ:562980080
 * wechat:ITnan562980080
 * Email:562980080@qq.com
 */
@WebServlet(name = "ShowImageServlet", urlPatterns = {"/showImage"})
public class ShowImageServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.log("显示图片");
        String path = "/Users/tibbytang/Image";
        String fileName = request.getParameter("name");
        File file = new File(path + File.separator + fileName);
        //设置头信息,内容处理的方式,attachment以附件的形式打开,就是进行下载,并设置下载文件的命名
        response.setHeader("Content-Disposition","attachment;filename="+file.getName());
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int len = 0;
        ServletOutputStream writer = response.getOutputStream();
        while ((len = fileInputStream.read(buffer)) != -1) {
            writer.write(buffer, 0, len);
        }
        fileInputStream.close();
        writer.flush();
        writer.close();
    }
}
