package com.strong.fee.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * author: 小殊
 * create: 2018/9/17 上午11:29
 */
@Service
public class CustomerZuulFilter extends ZuulFilter {
    @Override
    public ZuulFilterResult runFilter() {
        return super.runFilter();
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String accessToken = String.valueOf(request.getHeader("security"));
//        if(!accessToken.equals("zz")) {
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            return null;
//        }
        return null;

    }
}
