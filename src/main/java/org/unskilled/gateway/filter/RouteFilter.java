package org.unskilled.gateway.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class RouteFilter extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(RouteFilter.class);

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		   RequestContext ctx = RequestContext.getCurrentContext();
		    HttpServletRequest request = ctx.getRequest();

		    log.info(String.format("%s Route from %s", request.getMethod(), request.getRequestURL().toString()));
		return 3;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "route";
	}

}
