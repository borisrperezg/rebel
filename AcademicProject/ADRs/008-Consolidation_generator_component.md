# 008. Consolidation generator component

Date: 2021-03-25 9:00
Phase: Sprint 2
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system through horizontal scaling

## Decision

Chosen option: "Create component for summarization operations". A new component is created to handle only operations about averages and summarization. This way it is possible to increase cohesion in this operation. Also, maintainability can be improved by this strategy.

## Alternatives

* No alternatives.