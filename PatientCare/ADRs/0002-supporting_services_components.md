# 0002. Supporting application services with components

Date: 2020-02-19 21:38
Phase: Sprint 1
Deciders: Boris Perez, Camilo Castellanos
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* It is expected to increase automation of patient assignment by 50 percent.
* It is expected a big increase in the number of request. The company is increasing its market participation. 
* Time of response should be kept under 1 second.

## Decision

Chosen option: "Provide support for application services". New application componentes are created to support and to provide functionality to application services. Application components are: Self-registration application component and Patient information system component. Two components are initially created to support these services, however, it is expected to include more components in the following versions.

## Alternatives

* Support application services in one-to-one relationship