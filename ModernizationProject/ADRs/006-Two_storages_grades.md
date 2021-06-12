# 006. Two storages for increase availability for grades

Date: 2021-03-22 10:00
Phase: Sprint 2
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system through horizontal scaling

## Decision

Chosen option: "Create two storages for support availability of grades". This was achieved to increase availability of grades and to improve response times. Two types of storages are included: file storage and physical storages. The first one is used to replicated the data used for students' grades, and the second is used to storage the data in a database. It is expected that Courses Management component go to the File Management component in order to get the grades. There is a necessity to develop some synchronization mechanism to avoid keep two data sources with different data.

## Alternatives

* To have a second database as local