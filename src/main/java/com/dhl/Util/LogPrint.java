package com.dhl.Util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogPrint {
    public static String WriteInfoLog(String info) {
//        Logger logger = Logger.getLogger("TestLogger");

//        logger.log(Level.INFO, "**************************START**************************************");

        return "["
                + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                + "] : "
                + info
                + ";";
    }
}
