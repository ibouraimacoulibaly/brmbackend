package com.brm.brmbank.config;

import com.brm.brmbank.service.AppUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configurable
@EnableWebSecurity
// Modifying or overriding the default spring boot security.
public class WebConfig extends WebSecurityConfigurerAdapter {

    @Autowired
	AppUserDetailsService appUserDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(appUserDetailsService);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}
		};
	}



	@Override
	public void configure(WebSecurity web) throws Exception {
		super.configure(web);
	}


	// This method is used for override HttpSecurity of the web Application.
	// We can specify our authorization criteria inside this method.
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and()
				// starts authorizing configurations
				.authorizeRequests()
				// ignoring the guest's urls "
				.antMatchers("/utilisateur/login","/utilisateur/save","/utilisateur","/utilisateur/delete", "/utilisateur/modifier/{username}", "/utilisateur/details/{username}",
						"/devise/login","/devise/save","/devise","/delete/{idDevise}", "/delete/{idDevise}", "/abonnes/save", "/abonnes", "/abonnes/delete", "/abonnes/details/{username}", "/abonnes/modifier/{username}")
				.permitAll()
				// authenticate all remaining URLS
				.anyRequest().authenticated().and()
				/* "/logout" will log the user out by invalidating the HTTP Session,
				 * cleaning up any {link rememberMe()} authentication that was configured, */
				.logout()
				.permitAll()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout", "POST"))
				.and()
				// enabling the basic authentication
				.httpBasic().and()
				// configuring the session on the server
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				// disabling the CSRF - Cross Site Request Forgery
				.csrf().disable();
	}
	@Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }


}
