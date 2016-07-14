package by.cromvel.servicebeld.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InitializerSprMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ConfigSprMVC.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter utf8filter = new CharacterEncodingFilter();
		utf8filter.setEncoding("UTF-8");
		utf8filter.setForceEncoding(true);
		return new Filter[] { utf8filter };

	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
