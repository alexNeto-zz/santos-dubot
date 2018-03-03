package com.admin.tafmetar.shared;

import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

public class BusinessException extends RuntimeException {

    private Collection<String> messages;

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(String msg, Exception cause) {
        super(msg, cause);
    }

    public BusinessException(Collection<String> messages) {
        super();
        this.messages = messages;
    }

    public BusinessException(Collection<String> messages, Exception cause) {
        super(cause);
        this.messages = messages;
    }

    @Override
    public String getMessage() {
        String msg;
        if (this.messages != null && !this.messages.isEmpty()) {
            msg = "[";
            for (String message : this.messages) {
                msg += message + ",";
            }
            msg = StringUtils.removeEnd(msg, ",") + "]";
        } else msg = super.getMessage();
        return msg;
    }
}