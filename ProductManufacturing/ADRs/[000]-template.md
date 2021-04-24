# 0001. Supporting business processes

Date: 2020-02-19 21:38
Phase: Sprint 1
Deciders: Boris Perez, Camilo Castellanos
Status: accepted

## Motivator

* It is expected a big increase in the number of request. The company is increasing its market participation. 
* It is expected to increase 200% in the number of request. 
* Time of response should be kept under 1 second.

## Decision

Chosen option: "Implement a load balancing", because we already have several servers and the idea is to improve the way requests are handle.

## Alternatives

* Implement a load balancing
* Cloud service to scale by demand

## Assumptions

* There is a list of servers available
* Each server can answer at least 1000 request per second for 2 minutes

## Consequences

+ control of the servers
+ lower expenses
- time configuring the load balancer


