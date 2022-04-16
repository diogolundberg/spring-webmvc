package webmvc;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Application {
    public static void main(String[] params) throws Exception {
        AnnotationConfigWebApplicationContext webApplication = new AnnotationConfigWebApplicationContext();
        webApplication.register(Config.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplication);

        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.addServlet(new ServletHolder(dispatcherServlet), "/");

        Server server = new Server(8080);
        server.setHandler(contextHandler);
        server.start();
    }
}