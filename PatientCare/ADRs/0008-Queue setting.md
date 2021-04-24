# 0008. Introduction of queue to support communication

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

Chosen option: "Implement queue for distributed communication". This is related to a proof of concept. We are experimenting with queues for support distributed communication among components. There are implemented two queues, an outbound queue: Waiting outbound queue and an inbound queue: Assignment inbound queue. These two queues are related through a topir defined by the collaboration element Assignment tool collaboration. It is expected to have an improvement in the interconnection of components.

## Alternatives

* Communicate through common mechanism.