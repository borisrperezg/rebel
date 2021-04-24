# 0005. Creation triggering selfregistration application

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

Chosen option: "Triggering actions". Several components were built using a not complete implementation, therefore, it was required to trigger an invocation to a second component in order to complete the task. It is known that this action could affect the maintainability of the service provided, however, it is quite fast that trying to build the whole component. The trigger action is done from Self registration application component and Historical data validation.

## Alternatives

* Rewrite the whole service