package com.springrestapi.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

import com.springrestapi.restapi.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    
    HashMap<String,CloudVendor> map = new HashMap<String,CloudVendor>();

    // CloudVendor cloudVendor;
    
    @GetMapping("/")
    public ArrayList<CloudVendor> getAllCloudVendors() {
        return new ArrayList<CloudVendor>(map.values());
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        return map.get(vendorId);
        // return new CloudVendor("C1","Vendor 1",
        // "Address 1","XYZXYZ")
    }

    @PostMapping
    public String postCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        // this.cloudVendor = cloudVendor;
        map.put(cloudVendor.getVendorId(),cloudVendor);
        System.out.println(cloudVendor.getVendorId()+ "     "+cloudVendor);
        return "Cloud Vendor Details posted Successfully";
    }

    @PutMapping
    public String putCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        // this.cloudVendor = cloudVendor;
        map.put(cloudVendor.getVendorId(),cloudVendor);
        return "Cloud Vendor Details updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        // this.cloudVendor = null;
        map.remove(vendorId);
        return "Cloud Vendor Details deleted Successfully";
    }

}
