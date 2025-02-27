package com.connectitvity.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectitvity.me.CartItem;
import com.connectitvity.me.User;
import com.connectitvity.repository.CartItemRepository;

import java.util.List;

@Service
public class CartService {
    
    @Autowired
    private CartItemRepository cartItemRepository;

 

	public CartItem saveDetails(CartItem cartItem) {
		return cartItemRepository.save(cartItem);
	 
		
	}


 
}
