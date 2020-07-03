package interceptor;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IndexInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("prehandle(), 在访问controller之前被调用");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("posthandle(), 在访问controller之后，访问视图之前被调用，" +
                "这里可以注入一个时间到modelAndView中，用于后续视图显示");
        modelAndView.addObject("date", "由拦截器生成的时间:" +
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));


    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion(), 在访问视图之后被调用");
    }
}
