package org.raniaia.poseidon.components.log.slf4j;

import org.raniaia.poseidon.components.log.Log;
import org.raniaia.poseidon.framework.provide.component.Component;

/**
 * <p/>
 * License: <a href="https://github.com/Laniakeamly/poseidon/blob/master/LICENSE">Apache License 2.0</a>
 * <p/>
 * Copyright: Create by tiansheng on 2019/12/17 18:29
 * @author tiansheng
 * @version 1.0.0
 * @since 1.8
 */
@Component
public class Slf4jLog implements Log {

    private org.slf4j.Logger logger;

    public Slf4jLog() {
    }

    public Slf4jLog(org.slf4j.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void info(String msg) {
        logger.info(msg);
    }

    @Override
    public void warn(String msg) {
        logger.warn(msg);
    }

    @Override
    public void debug(String msg) {
        logger.debug(msg);
    }

    @Override
    public void error(String msg) {
        logger.error(msg);
    }

}