package com.app.dao;

import com.app.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorDAO extends JpaRepository<VendorEntity, String> {

}
