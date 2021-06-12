# 011. Inmemory storage for local access of data

Date: 2021-03-25 10:00
Phase: Sprint 3
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system through horizontal scaling

## Decision

Chosen option: "Change local file storage to in-memory local storage". This decision is done to improve access to data. File storage will require some extra efforts in case of future changes of tables and to synchronize the data with the physical storage. In-memory storage allows a faster access and to reduce the time required to perform some synchronization.

## Alternatives

* To have a second database as local