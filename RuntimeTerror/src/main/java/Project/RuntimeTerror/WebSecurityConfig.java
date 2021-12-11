package Project.RuntimeTerror;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import Project.RuntimeTerror.web.UserDetailsServiceImpl;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
	@Autowired
    private UserDetailsServiceImpl userDetailsService;	
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests().antMatchers("/addquestions").authenticated()
        .and()
        .cors().and().csrf().disable()
        .authorizeRequests()
        .anyRequest().permitAll()
        .and()
      .formLogin()
          .defaultSuccessUrl("/addquestions")
          .permitAll()
          .and()
      .logout()
          .permitAll();
    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
}
