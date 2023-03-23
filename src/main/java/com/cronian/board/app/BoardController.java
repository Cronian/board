package com.cronian.board.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "board")
public class BoardController {
    @GetMapping(value = "/list")
    public String boardList() {
        return "board/list";
    }
}
