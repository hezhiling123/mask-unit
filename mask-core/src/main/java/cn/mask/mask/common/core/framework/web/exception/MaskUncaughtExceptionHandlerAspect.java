package cn.mask.mask.common.core.framework.web.exception;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

public class MaskUncaughtExceptionHandlerAspect {
    @Autowired
    private MaskUncaughtExceptionHandler maskUncaughtExceptionHandler;

    public MaskUncaughtExceptionHandlerAspect() {
    }

    public void doBefore(JoinPoint jp) {
        Thread.setDefaultUncaughtExceptionHandler(this.maskUncaughtExceptionHandler);
    }
}
