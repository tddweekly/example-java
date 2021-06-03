package com.tddweekly.java.example.support;

import com.tddweekly.java.example.organization.OrganizationService;

import java.util.List;

class SupportService {
    private final OrganizationService organizationService;
    private final InMemorySupportPlanRepository repository;

    SupportService(OrganizationService organizationService, InMemorySupportPlanRepository repository) {
        this.organizationService = organizationService;
        this.repository = repository;
    }

    public List<SupportPlan> getAvailableSupportPlans() {
        // TODO: use organizationService & repository to make it work
        return List.of();
    }
}
