package com.tibbytang.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by tibbytang on 28/12/2016
 * QQ:562980080
 * wechat:ITnan562980080
 * Email:562980080@qq.com
 */
@WebFilter(filterName = "EditorFilter", urlPatterns = {"*"})
public class EditorFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
