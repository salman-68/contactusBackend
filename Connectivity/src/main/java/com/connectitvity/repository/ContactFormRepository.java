package com.connectitvity.repository;

import com.connectitvity.me.ContactUsME;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactFormRepository extends JpaRepository<ContactUsME, Long> {
}
