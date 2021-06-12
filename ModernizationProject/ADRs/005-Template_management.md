# 005. Template management for grades export

Date: 2021-03-22 10:00
Phase: Sprint 2
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system through horizontal scaling

## Decision

Chosen option: "Create component for template management". This component has two main responsabilities. First, it needs to keep an updated list of templates for data formatting. This is required to provide an uniform state of the data before any further transformation. The second responsability is related to use the data represented in an standard format and transform it into the required formato to be exported as PDF. Maybe this should be separated form each other to improve maintainability.

## Alternatives

* To have two components for handling formatting.