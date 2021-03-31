package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.sevice.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home")
public class HomeController {
    @Autowired
    BlogService blogService;

    @GetMapping
    ModelAndView showBlogs() {
        Iterable<Blog> blogs = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("blogs");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
    @GetMapping("{id}")
    String showBlogForm(@PathVariable("id") BlogController blogController, Model model) {
        model.addAttribute("blog", blogController);
        return "blogForm";
    }
}
