package org.gbihealth.samples.quickservice.application;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
  
public class WebInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {  
          
		// AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		// ctx.register(QuickServiceApplication.class);
		// ctx.setServletContext(servletContext);
		//
		// Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		// servlet.addMapping("/");
		// servlet.setLoadOnStartup(1);
          
    }  

}
