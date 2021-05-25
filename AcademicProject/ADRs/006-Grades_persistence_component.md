# 006. Grades persistence component

Date: 2021-03-25 9:00
Phase: Sprint 2
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system through horizontal scaling

## Decision

Chosen option: "Create component for data source management". Component Grades persistence is created to handle all the access to data about grades and personal information of students. It is important to keep separated how data can be accessed and by who.

## Alternatives

* No alternatives.