package com.TallyMarks.GrantsManagementInformationSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TallyMarks.GrantsManagementInformationSystem.Entity.PreformanceInformation;

public interface InformationRepository extends JpaRepository<PreformanceInformation, Long> {

	
}
