package com.warproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.warproject.entity.Addresss;

public interface AddressRepository extends JpaRepository<Addresss, Long> {

}
