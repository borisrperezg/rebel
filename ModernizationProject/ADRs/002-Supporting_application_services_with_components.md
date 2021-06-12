# 002. Supporting application services with components

Date: 2021-03-22 10:00
Phase: Sprint 2
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system through horizontal scaling

## Decision

Chosen option: "Provide support for application services". New application componentes are created to support and to provide functionality to application services. Some of the components support more than one application service. Application components are: Courses management, user management component, and template management. It is expected to increase the number of components in the following versions.

## Alternatives

* Support application services in one-to-one relationship