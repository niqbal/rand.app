package com.force.sample.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * Controller for all of the pages in this application.  The different pages are used by the 
 * implementation of spring security in this application.
 *
 * @author Nawab Iqbal
 *
 */
@Controller
public class TestController {

    /**
     * Controller method for page_with_login_link.html.
     * @return new ModelAndView object
     */
    @RequestMapping("page_with_login_link.html")
    public ModelAndView pageWithLoginLink() {
        ModelAndView mav = new ModelAndView();
        return mav;
    }

    /**
     * Controller method for page_with_logout_link.html.
     * @return new ModelAndView object
     */
    @RequestMapping("page_with_logout_link.html")
    public ModelAndView pageWithLogoutLink() {
        ModelAndView mav = new ModelAndView();
        return mav;
    }
    
    /**
     * Controller method for secured_page.html.
     * @return new ModelAndView object
     */
    @RequestMapping("secured_page.html")
    public ModelAndView securedPage() {
        ModelAndView mav = new ModelAndView();

        return mav;
    }
    
    /**
     * Controller method for login_success.html.
     * @return new ModelAndView object
     */  
    @RequestMapping("login_success.html")
    public ModelAndView loginSuccess() {
        ModelAndView mav = new ModelAndView();
        return mav;
    }
    
    /**
     * Controller method for logout_success.html.
     * @return new ModelAndView object
     */  
    @RequestMapping("logout_success.html")
    public ModelAndView logoutSuccess() {
        ModelAndView mav = new ModelAndView();
        return mav;
    }

}
