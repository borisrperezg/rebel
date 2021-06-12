# 004. Accessing complementary data from the user

Date: 2021-03-22 10:00
Phase: Sprint 2
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system through horizontal scaling

## Decision

Chosen option: "Create component to provide further operations on data from the user". This component is in charge for gathering additional data from the data sources. At first, component Courses management extracts all the information about numerical data. These data can be used to support several operations. When the calculations are done, and the required information is done, the system can request for the information of the users. This is avoided at first to reduce overload on the network. 

## Alternatives

* Extract all the information from the beginning of the business process.