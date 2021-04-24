# 0004. Interdependency of components

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

Chosen option: "Bidirectional connection between components". We are aware the problems related to this kind of connection between components, however, it was required to create a link between Warehouse application and Delivery system. At first, this was not considered at all but now, as the system is modeled, it is clear that this need to be changed. However, this could be more integrated later in the development. For now, this could be work this way. Having all the logic in each component will produce duplication of code, therefore, it is fine to have this kind of linking communication.

## Alternatives

* Having separate components.