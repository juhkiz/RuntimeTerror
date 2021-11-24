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
       .authorizeRequests().antMatchers("/addquestions").authenticated() // Pitäisi pyytää kirjautumaan kun yrittää lisätä kysymyksiä
        .and()
        .authorizeRequests() // ehkä pitää poistaa
        .anyRequest().permitAll() // sallii kaikki pyynnöt
        .and()
      .formLogin()
          .defaultSuccessUrl("/addquestions") //vakiona menee tänne kirjautumisen jälkeen
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
