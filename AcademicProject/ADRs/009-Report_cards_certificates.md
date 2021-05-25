# 009. Report cards and certificate component

Date: 2021-03-25 9:00
Phase: Sprint 2
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system through horizontal scaling

## Decision

Chosen option: "Create component for build report card and certificates". This component is responsible of create the specific structures and representations of data to create the output file. This component is in charge of select the required data representation among several alternatives.

## Alternatives

* No alternatives.