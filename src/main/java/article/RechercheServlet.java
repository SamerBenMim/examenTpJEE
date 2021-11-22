package article;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.GestionProduits;

@WebServlet(name = "ServletListe", value = "/ServletListe")
public class RechercheServlet extends HttpServlet {


	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionProduits gp=new GestionProduits();
        Vector ProductList=gp.listKeyword(request.getParameter("keyword"));
        if (ProductList.isEmpty())
        {
        	getServletContext().getRequestDispatcher("/ArticleInexistant.jsp").forward(request,response);
        }
        else
        {
        Cookie cookie=new Cookie("cookie",URLEncoder.encode("L'article existe", "UTF-8"));
        response.addCookie(cookie);
        request.setAttribute("ProductVect",ProductList);
        getServletContext().getRequestDispatcher("/liste.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
