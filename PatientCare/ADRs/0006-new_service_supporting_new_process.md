# 0006. New service to support new process

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

Chosen option: "Support new business process". A new business process element was included into the business process. Next Control Estimation business process is now supported through Future Control Service application service. Functionality of this application service is provided by Controls Estimator Component. The goal of this implementation is to provide the client with infomation about next activities to perform after the process of leaving the date.

## Alternatives

* Rewrite the whole service