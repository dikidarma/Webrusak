package com.ContohWebRusak.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ContohWebRusak.Model.ComfortModel;
import com.ContohWebRusak.Model.WebModel;

public interface ComfortRepository extends JpaRepository<ComfortModel, Long>{
	
	@Query(value="SELECT * FROM `services` WHERE nama title %?1%",nativeQuery = true)
	List<ComfortModel> getUserByTitle(String comfort);
	
	List<ComfortModel> findByTitleContaining(String title);
	
	List<ComfortModel> findByDeskripsiContainingAndTitleContaining(String deskripsi,String title);
}