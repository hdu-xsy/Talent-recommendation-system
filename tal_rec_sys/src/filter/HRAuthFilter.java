/**
 * @Created: xsy
 * @Data: 2018.11.20
 * @description: 判断是否有HR及以上权限 若为否则返回之前页面
 * */
package filter;

import bean.LoginUser;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HRAuthFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {

    }

    public void  doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws java.io.IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        //request.getSession().setAttribute("user",new LoginUser("u","p","1","admin")); //test
        LoginUser stf = (LoginUser) request.getSession().getAttribute("user");
        if(!stf.getJob_type().equals("HR")) {
            response.sendRedirect("/");
        }
        chain.doFilter(request,response);
    }
    public void destroy()  {

    }


}
