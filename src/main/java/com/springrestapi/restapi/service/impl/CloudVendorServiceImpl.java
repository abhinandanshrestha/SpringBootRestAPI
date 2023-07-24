package com.springrestapi.restapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapi.restapi.model.CloudVendor;
import com.springrestapi.restapi.repository.CloudVendorRepository;
import com.springrestapi.restapi.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
    @Autowired
    CloudVendorRepository cloudVendorRepository;


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
            cloudVendorRepository.save(cloudVendor);
            return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVEndorId) {
        cloudVendorRepository.deleteById(cloudVEndorId); 
        return "Deleted";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
      return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
    
}
