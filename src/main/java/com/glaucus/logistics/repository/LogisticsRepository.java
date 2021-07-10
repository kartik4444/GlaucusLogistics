package com.glaucus.logistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.glaucus.logistics.model.LogisticModel;

/*
 * Repository Class 
 */
@Repository
public interface LogisticsRepository extends JpaRepository<LogisticModel, Integer> {

	/*
	 * Custom Query for fetching current counter value for given Id
	 */
	@Query(value = "select index_counter from number where id=?1", nativeQuery = true)
	public Integer findById(int id);

}
