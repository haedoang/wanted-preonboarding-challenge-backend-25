package com.wanted.clone.oneport.core.config;

import com.wanted.clone.oneport.core.config.filter.PaymentArgumentBindFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FilterConfig {

    private final PaymentArgumentBindFilter paymentArgumentBindFilter;

    @Bean
    public FilterRegistrationBean<PaymentArgumentBindFilter> argumentBindFilter() {
        FilterRegistrationBean<PaymentArgumentBindFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(paymentArgumentBindFilter);
        registrationBean.addUrlPatterns("/payment/request/*");
        return registrationBean;
    }
}
