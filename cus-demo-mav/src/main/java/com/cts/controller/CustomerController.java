package com.cts.controller;



import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.customer.Customer;
import com.cts.service.CustomerService;

import jakarta.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerservice;
    @InitBinder
    public void initBinder(WebDataBinder binder) {
    	binder.addCustomFormatter(new Formatter<LocalDate>() {
    		private final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    				
			@Override
			public String print(LocalDate object, Locale locale) {
				// TODO Auto-generated method stub
				return object.format(formatter);
			}

			@Override
			public LocalDate parse(String text, Locale locale) throws ParseException {
				// TODO Auto-generated method stub
				return LocalDate.parse(text, formatter);
			}
    		
    	});
    	}
    @GetMapping("/")
    public ModelAndView getAll() {
        var customers = customerservice.getAllCustomers();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("customers", customers);
        return mv;
    }

    //@RequestMapping(path="/add", method=RequestMethod.GET)
    @GetMapping("/add")
    public String showAdd(Model model) {
        model.addAttribute("customer", new Customer());
        return "add";
    }

    @PostMapping("/add-customer")
    public String addCustomer(@ModelAttribute Customer customer,BindingResult result) {
    	if(result.hasErrors()) {
    		return "add";
    	}
        customerservice.addCustomer(customer);
        return "redirect:/";
    }  
     @GetMapping("/update")
     public String showUpdate(@Valid @RequestParam("custId")int id,Model model) {
    	 model.addAttribute("customer",customerservice.getById(id));
    	 return "update";
    }
     @PostMapping("/update-customer")
     public String updateCustomer(@Valid @ModelAttribute Customer customer,BindingResult result){
    	 if(result.hasErrors()) {
     		return "update";
     	}
         customerservice.updateCustomer(customer);
         return "redirect:/";
     } 
     @GetMapping("/delete")
     public String delete( @RequestParam("custId")int id,Model model) {
    	 customerservice.deleteCustomer(id);
         return "redirect:/";
    }
}

