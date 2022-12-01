package com.example.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        strictFillStrategy(metaObject,"createTime", LocalDateTime::now);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        strictFillStrategy(metaObject,"updateTime", LocalDateTime::now);
    }
}
