package com.tibbytang.controller;

import com.tibbytang.util.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

/**
 * Created by tibbytang on 31/12/2016
 * QQ:562980080
 * wechat:ITnan562980080
 * Email:562980080@qq.com
 */
@WebServlet(name = "UploadServlet", urlPatterns = {"/upload"})
@MultipartConfig
public class UploadServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.log("start upload");
        String path = "/Users/tibbytang/Image";
        Collection<Part> partCollection = request.getParts();
        for (Part part : partCollection) {
            String header = part.getHeader("content-disposition");
            String fileName = getFileName(header);
            logger.log("header=" + header);
            logger.log("fileName=" + fileName);
            part.write(path + File.separator + fileName);
        }
        PrintWriter writer = response.getWriter();
        writer.write("upload successfully");
        writer.flush();
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.log("upload");
        request.getRequestDispatcher("WEB-INF/upload.jsp").forward(request, response);
    }

    /**
     * * 根据请求头解析出文件名
     * * 请求头的格式：火狐和google浏览器下：form-data; name="file"; filename="snmp4j--api.zip"
     * *                 IE浏览器下：form-data; name="file"; filename="E:\snmp4j--api.zip"
     * * @param header 请求头
     * * @return 文件名
     */
    public String getFileName(String header) {
        /**
         * String[] tempArr1 = header.split(";");代码执行完之后，在不同的浏览器下，tempArr1数组里面的内容稍有区别
         * 火狐或者google浏览器下：tempArr1={form-data,name="file",filename="snmp4j--api.zip"}
         * IE浏览器下：tempArr1={form-data,name="file",filename="E:\snmp4j--api.zip"}
         */
        String[] tempArr1 = header.split(";");
        /**
         *火狐或者google浏览器下：tempArr2={filename,"snmp4j--api.zip"}
         *IE浏览器下：tempArr2={filename,"E:\snmp4j--api.zip"}
         */
        String[] tempArr2 = tempArr1[2].split("=");
        //获取文件名，兼容各种浏览器的写法
        String fileName = tempArr2[1].substring(tempArr2[1].lastIndexOf("\\") + 1).replaceAll("\"", "");
        return fileName;
    }
}
