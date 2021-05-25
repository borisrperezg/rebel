# 001. Supporting business processes through services

Date: 2021-03-22 10:00
Phase: Sprint 1
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system

## Decision

Chosen option: "Provide support for business processes". New services are created to provide operational support to them. The goal is to build a one-to-one relation between business processes and application services. This way, any change can be isolated and resolverd. Developed application services are: Grades service, grouping service, user complementary data, consolidation templates and PDF template plug. 

## Alternatives

* Support all operation through one service
* Use external services

## Consequences

+ control of the processes
+ independence
- developing time