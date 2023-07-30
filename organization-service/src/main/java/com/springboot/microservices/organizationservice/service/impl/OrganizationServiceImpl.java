package com.springboot.microservices.organizationservice.service.impl;

import com.springboot.microservices.organizationservice.dto.OrganizationDto;
import com.springboot.microservices.organizationservice.entity.Organization;
import com.springboot.microservices.organizationservice.mapper.OrganizationMapper;
import com.springboot.microservices.organizationservice.repository.OrganizationRepository;
import com.springboot.microservices.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization = organizationRepository.save(organization);
        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }
}
