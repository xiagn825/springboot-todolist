package com.example.todolist.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 便利贴
 *
 * Created by timxia on 2017/6/11.
 */
@XmlRootElement
public class Note implements Serializable{

    private static final AtomicInteger COUNT = new AtomicInteger();

    // 唯一标示
    private final int id;

    // 标题
    private String title;

    // 内容
    private String content;

    public Note() {
        this.id = COUNT.incrementAndGet();
    }

    public Note(String title, String content) {
        this.id = COUNT.incrementAndGet();
        this.title = title;
        this.content = content;
    }

    // 创建时间
    private long createTime;

    // 更新时间
    private long updateTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }
}
