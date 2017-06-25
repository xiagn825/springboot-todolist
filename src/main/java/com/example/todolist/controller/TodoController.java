package com.example.todolist.controller;

import com.example.todolist.entity.Note;
import com.example.todolist.entity.ResDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by timxia on 2017/4/4.
 */
@RequestMapping("/todo")
@Controller
public class TodoController {

    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);


    private static List<Note> todoList = new ArrayList<>();

    static {
        todoList.add(new Note("暑期订课", "1.测试；2.上海六年级课程计划；3.目前订课人数很少(少于50人)"));
        todoList.add(new Note("小升初初升高订课", "1.产品上架；2.课程准备；3.作业提交逻辑"));
        todoList.add(new Note("订课排课流程再优化", "1.自动邮件；2.第2节课自动分班(老师开时间问题)；3.第三节课监控学生交作业"));
        todoList.add(new Note("blog文章准备", "1.每天1条linux命令；2.mybatis学习；3.spring-boot相关；4.Rest-Assured总结；5.wrk压测工具"));
    }

    @RequestMapping(method = RequestMethod.GET, produces = {"application/json", "application/xml"})
    public @ResponseBody
    List<Note> showAll() {
        ResDTO resDto = new ResDTO();
        logger.debug("代办事项：{}", todoList);
        resDto.setData(todoList);
        return todoList;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showAll(ResDTO resDto) {
        logger.debug("代办事项：{}", todoList);
        resDto.setData(todoList);
        return "todoList";
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
    public @ResponseBody Note show(@PathVariable("id") int id) {
        logger.debug("查看代办事项：{}", todoList);
        return todoList.get(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Note addTodo(@RequestBody Note note) {
        logger.debug("添加代办事项：{}", note);
        todoList.add(note);

        return note;
    }
}
