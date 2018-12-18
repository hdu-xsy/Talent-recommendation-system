package servlet.Packer4WF;

import bean.ConfirmUser;
import ienum.eErrorPage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "OfferRefuse")
public class OfferRefuse extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        ConfirmUser user=(ConfirmUser) session.getAttribute("confirm_user");
        if(user==null){
            response.sendRedirect(eErrorPage.PERMISSIONDENY.toString());
            return;
        }
        String rec_id=user.getId();
        String name=user.getName();
        String sex=user.getSex();
        //****************************code to register(use workflow)*************************************
        response.sendRedirect("");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}