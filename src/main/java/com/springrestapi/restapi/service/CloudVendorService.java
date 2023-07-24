package com.springrestapi.restapi.service;

import java.util.List;

import com.springrestapi.restapi.model.CloudVendor;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVEndorId);
    public CloudVendor getCloudVendor(String cloudVEndorId);
    public List<CloudVendor> getAllCloudVendors();
}
