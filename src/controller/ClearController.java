package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ClearController {
    @RequestMapping("/clear")
    public ModelAndView clear(HttpSession session) {
        session.removeAttribute("count");
        ModelAndView mav = new ModelAndView("redirect:/check");
        return mav;
    }
}
