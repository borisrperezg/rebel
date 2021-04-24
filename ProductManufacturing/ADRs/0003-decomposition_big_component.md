# 0003. Definition of components to support services

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

Chosen option: "Descomposition of big component in small ones". To keep maintainability, the component Patient information system component is decomposed into three components. Each component is now supporting one service. New components are: Caring practices application, patient information system component and Queue application component. Also, the service Queuing service was renamed to Queuing care. This was done to keep a better organization of name related to their business processes.

## Alternatives

* Keep one big component supporting several services.