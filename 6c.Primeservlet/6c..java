package program6c;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            if (number < 2) {
                out.println("<html><body>");
                out.println("<h2>" + number + " is NOT a prime number.</h2>");
            } else if (isPrime(number)) {
                out.println("<html><body>");
                out.println("<h2>" + number + " is a prime number.</h2>");
            } else {
                out.println("<html><body>");
                out.println("<h2>" + number + " is NOT a prime number.</h2>");
            }

            out.println("<a href='prime.html'>Check another number</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h2>Error: Invalid input. Please enter a valid number.</h2>");
            out.println("<a href='prime.html'>Try again</a>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}