package com.example.legacy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;


@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Value("${oauth.client-id}")
	private String clientId;
	
	@Value("${oauth.client_secret}")
	private String clientSecret;
	
	@Value("${oauth.checkTokenEndpoint}")
	private String checkTokenEndpoint;
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.tokenServices(resourceServerTokenServices());
	}
	
	@Bean
	protected ResourceServerTokenServices resourceServerTokenServices() {
		RemoteTokenServices remoteTokenServices = new RemoteTokenServices();
		remoteTokenServices.setClientId(clientId);
		remoteTokenServices.setClientSecret(clientSecret);
		remoteTokenServices.setCheckTokenEndpointUrl(checkTokenEndpoint);
		return remoteTokenServices;
	}
}
