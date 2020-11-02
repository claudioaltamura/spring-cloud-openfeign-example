package de.claudioaltamura.spring.cloud.openfeign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
//import org.keycloak.KeycloakSecurityContext;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;

public class AuthorizationRequestInterceptor { //implements RequestInterceptor {

    private static final String AUTHORIZATION_HEADER="Authorization";
    private static final String TOKEN_TYPE = "Bearer";

//    @Override
//    public void apply(RequestTemplate requestTemplate) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if(authentication != null && authentication.getCredentials() instanceof KeycloakSecurityContext) {
//            KeycloakSecurityContext keycloakSecurityContext = (KeycloakSecurityContext) authentication.getCredentials();
//            requestTemplate.header(AUTHORIZATION_HEADER, String.format("%s %s", TOKEN_TYPE, keycloakSecurityContext.getTokenString()));
//        }
//    }
}
