package com.lambdaschool.watermyplants.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * This class enables and configures the Authorization Server. The class is also responsible for granting authorization to the client.
 * This class is responsible for generating and maintaining the access tokens.
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig
        extends AuthorizationServerConfigurerAdapter
{

    static final String CLIENT_ID = System.getenv("OAUTHCLIENTID");


    static final String CLIENT_SECRET = System.getenv("OAUTHCLIENTSECRET"); // read from environment variable

    static final String GRANT_TYPE_PASSWORD = "password";


    static final String AUTHORIZATION_CODE = "authorization_code";

    static final String SCOPE_READ = "read";

    static final String SCOPE_WRITE = "write";


    static final String TRUST = "trust";

    static final int ACCESS_TOKEN_VALIDITY_SECONDS = -1;


    @Autowired
    private TokenStore tokenStore;


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void configure(ClientDetailsServiceConfigurer configurer)
            throws
            Exception
    {
        configurer.inMemory()
                .withClient(CLIENT_ID)
                .secret(encoder.encode(CLIENT_SECRET))
                .authorizedGrantTypes(GRANT_TYPE_PASSWORD,
                        AUTHORIZATION_CODE)
                .scopes(SCOPE_READ,
                        SCOPE_WRITE,
                        TRUST)
                .accessTokenValiditySeconds(ACCESS_TOKEN_VALIDITY_SECONDS);
    }

    /**
     * Connects are endpoints to our custom authentication server and token store.
     * We can also rename the endpoints for certain oauth functions
     *
     * @param endpoints The Authorization Server Endpoints Configurer is created and managed by Spring Boot Security.
     *                  We give the configurer some custom configuration and let it work!
     * @throws Exception if the configuration fails
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints)
            throws
            Exception
    {
        endpoints.tokenStore(tokenStore)
                .authenticationManager(authenticationManager);
        // here instead of our clients requesting authentication at the endpoint /oauth/token, they request it at the endpoint /login
        endpoints.pathMapping("/oauth/token",
                "/login");
    }
}