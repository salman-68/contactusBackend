package com.connectitvity.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.connectitvity.me.CartItem;
import com.connectitvity.service.CartService;

 

@RestController
@RequestMapping("/api/cart")
public class CartController {
    
    @Autowired
    private CartService cartService;
    @PostMapping("/save")
    public ResponseEntity<CartItem> saveData(@RequestBody CartItem cartItem)
    {
    	CartItem cartItem2=cartService.saveDetails(cartItem);
    	return ResponseEntity.status(HttpStatus.OK).header("info", "Data Saved Successfully").body(cartItem2);
    }

           
    
      
    
        }
