package com.connectitvity.repository;
 

 
import org.springframework.data.jpa.repository.JpaRepository;

import com.connectitvity.me.CartItem;
import com.connectitvity.me.User;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
