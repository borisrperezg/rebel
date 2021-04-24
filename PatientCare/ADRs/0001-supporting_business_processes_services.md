# 0001. Supporting business processes through services

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

Chosen option: "Provide support for business processes". New services are created to provide operational support to them. The goal is to build a one-to-one relation between business processes and application services. Developed application services are: Self-registration service, guidance service, queuing service, patient record service and care practices service. 

## Alternatives

* Support all operation through one service
* Use external services

## Consequences

+ control of the processes
+ independence
- developing time