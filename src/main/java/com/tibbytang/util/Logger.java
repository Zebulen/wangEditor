package com.tibbytang.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tibbytang on 21/12/2016
 * QQ:562980080
 * wechat:ITnan562980080
 * Email:562980080@qq.com
 * 日志工具类
 */
public class Logger {
    private static final Logger logger = new Logger();
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private Logger() {
    }

    public static Logger getLogger() {
        return logger;
    }

    public void log(String log) {
        String time = simpleDateFormat.format(new Date());
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append(time);
        builder.append("]");
        builder.append("\t");
        builder.append(log);
        System.out.println(builder.toString());
    }
}
