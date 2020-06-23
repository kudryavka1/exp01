package web.servlet;

import domain.Cart;
import service.BusinessService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteCartFood")
public class DeleteCartFood extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("foodid");

        Cart cart = (Cart) request.getSession().getAttribute("cart");

        BusinessService businessService = new BusinessService();
        businessService.deleteFood(id,cart);
        request.getRequestDispatcher("/exp01/listCart.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
