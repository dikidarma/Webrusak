package com.ContohWebRusak.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ContohWebRusak.Model.WebModel;

	public interface WebRepository extends JpaRepository<WebModel, Long>{
	@Query(value="SELECT*FROM `web` WHERE nama Like %?1%",nativeQuery=true)
	List<WebModel> getUserByNama(String web);
	List<WebModel> findByNamaLike(String nama);
		
}

