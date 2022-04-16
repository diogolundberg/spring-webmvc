package webmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import webmvc.service.CrudService;

public class Application {
    public static void main(String[] params) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        var service = context.getBean(CrudService.class);
        System.out.println(service.list());

    }
}