package cn.mask.mask.common.core.framework.web.exception;

import java.lang.Thread.UncaughtExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaskUncaughtExceptionHandler implements UncaughtExceptionHandler {
    private final Logger log = LoggerFactory.getLogger(MaskUncaughtExceptionHandler.class);

    public MaskUncaughtExceptionHandler() {
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        this.log.error("捕获到异常 : 线程名[" + t.getName() + "], 异常名[" + e + "]");
        e.printStackTrace();
    }
}
