package com.pro100kryto.server.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerListenerConsole implements ILoggerListener{
    private final DateTimeFormatter dtf;

    public LoggerListenerConsole() {
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:n");
    }


    @Override
    public void write(String loggerName, LocalDateTime dateTime, MsgType msgType, String msg) {
        System.out.println(""
                + "[" + dtf.format(dateTime).substring(0, 23) + "] "
                + "["+msgType.toString()+"] (" +loggerName+ ") "
                + msg );
    }
}
