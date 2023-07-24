package com.springrestapi.restapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestapi.restapi.model.CloudVendor;

//<ModelClassName, DataType of Id field>
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{
    
}
