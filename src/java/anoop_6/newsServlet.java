/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anoop_6;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
/**
 *
 * @author 2012
 */
public class newsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            String abc=request.getParameter("opt");
            String abc1=request.getParameter("opt1");
            String abc2=request.getParameter("opt2");
            
            request.setAttribute("abc", abc);
            request.setAttribute("abc1",abc1);
            request.setAttribute("abc2",abc2);
            
            String url;
            
            if("BBC".equals(abc)&&("Business".equals(abc1)))
            {
                url="http://feeds.bbci.co.uk/news/business/rss.xml";
            }
            else if("BBC".equals(abc)&&("Technology".equals(abc1)))
            {
                url="http://feeds.bbci.co.uk/news/technology/rss.xml";
            }
            
            else if("BBC".equals(abc)&&("World News".equals(abc1)))
            {
                url="http://feeds.bbci.co.uk/news/world/rss.xml";
            }
            else if("BBC".equals(abc)&&("Sports".equals(abc2)))
            {
                url="http://news.bbc.co.uk/sport2/hi/help/rss/default.stm";
            }
            else if("BBC".equals(abc)&&("Science".equals(abc2)))
            {
                url="http://feeds.bbci.co.uk/news/video_and_audio/science_and_environment/rss.xml";
            }
            else if("BBC".equals(abc)&&("Health".equals(abc2)))
            {
                url="http://feeds.bbci.co.uk/news/video_and_audio/health/rss.xml";
            }
            
            
            
            else if("NYT".equals(abc)&&("Business".equals(abc1)))
            {
                url="http://rss.nytimes.com/services/xml/rss/nyt/Business.xml";
            }
            else if("NYT".equals(abc)&&("Technology".equals(abc1)))
            {
                url="http://rss.nytimes.com/services/xml/rss/nyt/Technology.xml";
            }
            
            else if("NYT".equals(abc)&&("World News".equals(abc1)))
            {
                url="http://rss.nytimes.com/services/xml/rss/nyt/World.xml";
            }
            else if("NYT".equals(abc)&&("Sports".equals(abc2)))
            {
                url="http://rss.nytimes.com/services/xml/rss/nyt/Sports.xml";
            }
            else if("NYT".equals(abc)&&("Science".equals(abc2)))
            {
                url="http://rss.nytimes.com/services/xml/rss/nyt/Science.xml";
            }
            else if("NYT".equals(abc)&&("Health".equals(abc2)))
            {
                url="http://rss.nytimes.com/services/xml/rss/nyt/Health.xml";
            }
            
            
            else if("SMH".equals(abc)&&("Business".equals(abc1)))
            {
                url="http://www.smh.com.au/rssheadlines/business.xml";
            }
            else if("SMH".equals(abc)&&("Technology".equals(abc1)))
            {
                url="http://feeds.smh.com.au/rssheadlines/technology.xml";
            }
            
            else if("SMH".equals(abc)&&("World News".equals(abc1)))
            {
                url="http://feeds.smh.com.au/rssheadlines/world.xml";
            }
            else if("SMH".equals(abc)&&("Sports".equals(abc2)))
            {
                url="http://feeds.smh.com.au/rssheadlines/sport.xml";
            }
            else if("SMH".equals(abc)&&("Science".equals(abc2)))
            {
                url="http://feeds.smh.com.au/rssheadlines/national.xml";
            }
            else if("SMH".equals(abc)&&("Health".equals(abc2)))
            {
                url="http://feeds.smh.com.au/rssheadlines/entertainment.xml";
            }
            else
            
                {
                out.print("error page");
                return;
            }
            
            
            ServletContext context = getServletContext();                       
            InputStream xsl = (InputStream)
                        (context.getResourceAsStream("/anoop123.xsl"));
                   
    // We need two source objects and one result
    // get an external xml document using a url in a 
    // string format
    Source xmlDoc =  new StreamSource(url);
        
    Source xslDoc =  new StreamSource(xsl);
    Result result =  new StreamResult(out);
    // Prepare to transform 
    TransformerFactory factory = TransformerFactory.newInstance();
    Transformer trans = factory.newTransformer(xslDoc);
    trans.transform(xmlDoc,result);
   
           
//            out.println("<!DOCTYPE html>");
//            
//            out.println("<html>");
//            out.println("<head>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>You have selected " + result + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        }catch (TransformerConfigurationException ex) {
            Logger.getLogger(newsServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(newsServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    }
}