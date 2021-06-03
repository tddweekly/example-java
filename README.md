# Example tddweekly.com Java task

Join tddweekly.com Java newsletter to get a similar task each week.

Each e-mail contains
* User Story
* Link to the code repository with failing tests
* Short code explanation

## User Story

> _As Organization, I want to choose Support Plan available for my Tier_

* Each _Organization_ can be in _Tier_: `FREE`, `PREMIUM`, `PREMIUM+`
* There are _Support Plans_: `BASIC`, `FULL`, `DEDICATED`
* `FREE` _Tier_ can choose just `BASIC` _Support Plan_, should see others
* `PREMIUM` and `PREMIUM+` _Tier_ can choose `FULL` or `DEDICATED` _Support Plan_, shouldn't even see a `BASIC` one

## Code repository

This example repo :)

Task repositories are removed after 2 weeks.

## Short code overview

This is an example _Support Plan_ microservice
* The assumption is this service is called from the internal network
* `organization` package can be treated as a black box
  * `OrganizationService` provides the current _Organization_ _Tier_
  * Every microservice caller should provide _Tier_ in a dedicated `X-Organization-Tier` HTTP header
* `support` package is the main part
* All the logic should be inside `SupportService`
* `SupportServiceTest` should lead you
