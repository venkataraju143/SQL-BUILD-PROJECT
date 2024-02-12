package com.warproject.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warproject.entity.Addresss;
import com.warproject.repository.AddressRepository;
import com.warproject.service.AddressService;


@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepository addressRepository;

	@Override
	public Map<String, Object> saveAddress(Addresss address)    {
		Addresss existingAddress = addressRepository.save(address);
		Map<String, Object> map = new HashMap<>();
		if (existingAddress != null) {
			map.put("msg", "Address added");
			map.put("Address", existingAddress.getId());
		}
		return map;
		

}

	@Override
	public List<Addresss> getAllAddress() {
		return addressRepository.findAll();
	}

}

